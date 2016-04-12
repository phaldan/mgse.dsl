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
    String at(int minute);
}
