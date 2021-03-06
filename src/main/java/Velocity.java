import com.cronexpression.CronExpression;
import com.cronexpression.builder.cron.CronExpressionBuilder;
import com.cronexpression.meta.Expression;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;

import java.io.*;

import static com.cronexpression.builder.cron.Factory.*;

/**
 * @author Philipp Daniels
 */
public class Velocity {

    private static VelocityEngine ve = new VelocityEngine();
    private static final String PATH = "src/main/java/com/cronexpression/builder/";

    /**
     * @param args Command line arguments
     */
    public static void main(String[] args) throws IOException {
        ve.setProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, "src/main/resources/templates");
        ve.init();

        VelocityContext context = new VelocityContext();
        context.put("expression", cron().yearly().inMarch().on(day(10)).at(hour(12), minute(55)));

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Template template = ve.getTemplate("expression.xml.vm");
        template.merge(context, writer);
        writer.flush();
        writer.close();
    }

    private static CronExpression cron() {
        return new CronExpressionBuilder();
    }

    private static void wrong() throws IOException {
        Expression expression = new ExampleExpression();
        VelocityContext context = new VelocityContext();
        context.put("component", expression);

        String path = PATH + File.separator + expression.getName();
        new File(path).mkdir();
        generateFile(path, "Expression.java", context);
        generateFile(path, "Factory.java", context);
        generateFile(path, "List.java", context);
        generateFile(path, "Range.java", context);
        generateFile(path, "Step.java", context);
        generateFile(path, "CronExpressionBuilder.java", context);
    }

    private static void generateFile(String path, String filename, VelocityContext context) throws IOException {
        String filePath = path + File.separator + filename;
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)));

        Template template = ve.getTemplate(filename + ".vm");
        template.merge(context, writer);

        writer.flush();
        writer.close();
    }

    private static class ExampleExpression extends Expression {
        public ExampleExpression() {
            super("Philipp");
        }
    }
}
