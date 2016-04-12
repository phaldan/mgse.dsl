/**
 * @author Philipp Daniels
 */
public interface WeekContext {

    HourContext onMonday();

    HourContext onThuesday();

    HourContext onWednesday();

    HourContext onThursday();

    HourContext onFriday();

    HourContext onSaturday();

    HourContext onSunday();
}
