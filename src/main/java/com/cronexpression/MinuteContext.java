package com.cronexpression;

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
    IExpression at(Minute minute);

    /**
     * @param start Interval start inclusive
     * @param end   Interval end inclusive
     * @return MinuteContext
     */
    MinuteContext between(Hour start, Hour end);
}
