import com.cronexpression.CronExpression;
import com.cronexpression.builder.CronExpressionBuilder;

/**
 * @author Philipp Daniels
 */
public class Main {

    /**
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        //Run hourly at 5 past
        System.out.println(cron().hourly().at(5));
        //Run daily at 18:00
        System.out.println(cron().daily().at(18, 0));
        //Run weekly on Friday at 14:30
        System.out.println(cron().weekly().onFriday().at(14, 30));
        //Run monthly on 20th at 23:15
        System.out.println(cron().monthly().on(20).at(23, 15));
        //Run yearly in March on 10th at 12:55
        System.out.println(cron().yearly().inMarch().on(10).at(12, 55));
        //Run every 5 minutes between 10 to 50
        //Run every 2 hours between 6 to 18 at 12
        //Run every 3 days at 13:45
        //Run every 2 weeks on Friday at 18:10
        //Run every 4 month on 5th at 15:00
    }

    private static CronExpression cron() {
        return new CronExpressionBuilder();
    }
}
