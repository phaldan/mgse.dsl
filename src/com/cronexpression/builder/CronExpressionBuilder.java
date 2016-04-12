package com.cronexpression.builder;

import com.cronexpression.*;
import com.cronexpression.model.Expression;

/**
 * @author Philipp Daniels
 */
public class CronExpressionBuilder implements CronExpression {

    private static final String WILDCARD = "*";
    private Expression expression = new Expression();

    @Override
    public MinuteContext hourly() {
        expression.setHour(WILDCARD).setDayOfMonth(WILDCARD).setMonth(WILDCARD).setDayOfWeek(WILDCARD);
        return new MinuteContextBuilder();
    }

    @Override
    public HourContext daily() {
        expression.setDayOfMonth(WILDCARD).setMonth(WILDCARD).setDayOfWeek(WILDCARD);
        return new HourContextBuilder();
    }

    @Override
    public WeekContext weekly() {
        return null;
    }

    @Override
    public MonthContext monthly() {
        return null;
    }

    @Override
    public YearContext yearly() {
        return null;
    }

    private class MinuteContextBuilder implements MinuteContext {

        @Override
        public String at(int minute) {
            return expression.setMinute(String.valueOf(minute)).toString();
        }
    }

    private class HourContextBuilder implements HourContext {

        @Override
        public String at(int hour, int minute) {
            return expression.setHour(String.valueOf(hour)).setMinute(String.valueOf(minute)).toString();
        }
    }
}
