package com.cronexpression;

/**
 * @author Philipp Daniels
 */
public interface MonthContext {

    /**
     * Set day of month
     *
     * @param day Day of month
     * @return Return next level
     */
    HourContext on(MonthDay day);
}
