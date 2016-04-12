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
        expression.setDayOfMonth(WILDCARD).setMonth(WILDCARD);
        return new WeekContextBuilder();
    }

    @Override
    public MonthContext monthly() {
        expression.setDayOfWeek(WILDCARD).setMonth(WILDCARD);
        return new MonthContextBuilder();
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

    private class WeekContextBuilder implements WeekContext {

        private static final String MONDAY = "1";
        private static final String TUESDAY = "2";
        private static final String WEDNESDAY = "3";
        private static final String THURSDAY = "4";
        private static final String FRIDAY = "5";
        private static final String SATURDAY = "6";
        private static final String SUNDAY = "7";

        @Override
        public HourContext onMonday() {
            expression.setDayOfWeek(MONDAY);
            return new HourContextBuilder();
        }

        @Override
        public HourContext onTuesday() {
            expression.setDayOfWeek(TUESDAY);
            return new HourContextBuilder();
        }

        @Override
        public HourContext onWednesday() {
            expression.setDayOfWeek(WEDNESDAY);
            return new HourContextBuilder();
        }

        @Override
        public HourContext onThursday() {
            expression.setDayOfWeek(THURSDAY);
            return new HourContextBuilder();
        }

        @Override
        public HourContext onFriday() {
            expression.setDayOfWeek(FRIDAY);
            return new HourContextBuilder();
        }

        @Override
        public HourContext onSaturday() {
            expression.setDayOfWeek(SATURDAY);
            return new HourContextBuilder();
        }

        @Override
        public HourContext onSunday() {
            expression.setDayOfWeek(SUNDAY);
            return new HourContextBuilder();
        }
    }

    private class MonthContextBuilder implements MonthContext {

        @Override
        public HourContext on(int day) {
            expression.setDayOfMonth(String.valueOf(day));
            return new HourContextBuilder();
        }
    }
}
