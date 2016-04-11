/**
 * @author Philipp Daniels
 */
public interface CronExpressionBuilder {

    /**
     * Runs once every hour
     */
    MinuteContext hourly();

    /**
     * Runs once every day
     */
    HourContext daily();

}
