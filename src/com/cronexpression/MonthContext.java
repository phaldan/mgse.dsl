package com.cronexpression;

import com.cronexpression.model.Factory;

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
    HourContext on(Factory.MonthDay day);
}
