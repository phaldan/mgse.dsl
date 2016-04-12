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

    /**
     * Runs once per week
     */
    WeekContext weekly();

    /**
     * Runs once per month
     */
    MonthContext monthly();

    /**
     * Runs once per year
     */
    YearContext yearly();

}
