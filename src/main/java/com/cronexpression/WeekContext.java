package com.cronexpression;

/**
 * @author Philipp Daniels
 */
public interface WeekContext {

    HourContext onMonday();

    HourContext onTuesday();

    HourContext onWednesday();

    HourContext onThursday();

    HourContext onFriday();

    HourContext onSaturday();

    HourContext onSunday();
}
