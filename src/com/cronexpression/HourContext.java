package com.cronexpression;

import com.cronexpression.model.Factory;

/**
 * @author Philipp Daniels
 */
public interface HourContext {

    /**
     * Set hour and minute
     *
     * @param hour   Hour of a day
     * @param minute Minute of an hour
     * @return Returns cron expression as string
     */
    String at(Factory.Hour hour, Minute minute);
}
