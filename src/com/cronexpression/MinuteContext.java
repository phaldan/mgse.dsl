package com.cronexpression;

import com.cronexpression.model.Factory;

/**
 * @author Philipp Daniels
 */
public interface MinuteContext {

    /**
     * Set minute within an hour
     *
     * @param minute Minute of an hour
     * @return Returns cron expression string
     */
    String at(Factory.Minute minute);
}
