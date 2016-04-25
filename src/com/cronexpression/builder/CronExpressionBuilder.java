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
        expression.setDayOfWeek(WILDCARD);
        return new YearContextBuilder();
    }

    private class MinuteContextBuilder implements MinuteContext {

        @Override
        public String at(Minute minute) {

            if (minute.getValue() < 0 || minute.getValue() > 59) {
                throw new IllegalArgumentException("Invalid value '" + minute.getValue() + "' for minute.");
            }

            return expression.setMinute(String.valueOf(minute.getValue())).toString();
        }
    }

    private class HourContextBuilder implements HourContext {

        @Override
        public String at(Hour hour, Minute minute) {
            if (hour.getValue() < 0 || hour.getValue() > 23) {
                throw new IllegalArgumentException("Invalid value '" + hour + "' for hour.");
        	}
            if (minute.getValue() < 0 || minute.getValue() > 59) {
                throw new IllegalArgumentException("Invalid value '" + minute + "' for minute.");
        	}

            return expression
                    .setHour(String.valueOf(hour.getValue()))
                    .setMinute(String.valueOf(minute.getValue()))
                    .toString();
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
        public HourContext on(MonthDay day) {
            expression.setDayOfMonth(String.valueOf(day.getValue()));
            return new HourContextBuilder();
        }
    }

    private class YearContextBuilder implements YearContext {

        private static final String JANUARY = "1";
        private static final String FEBRUARY = "2";
        private static final String MARCH = "3";
        private static final String APRIL = "4";
        private static final String MAY = "5";
        private static final String JUNE = "6";
        private static final String JULY = "7";
        private static final String AUGUST = "8";
        private static final String SEPTEMBER = "9";
        private static final String OCTOBER = "10";
        private static final String NOVEMBER = "11";
        private static final String DECEMBER = "12";

        @Override
        public MonthContext inJanuary() {
            expression.setMonth(JANUARY);
            return new MonthContextBuilder();
        }

        @Override
        public MonthContext inFebruary() {
            expression.setMonth(FEBRUARY);
            return new MonthContextBuilder();
        }

        @Override
        public MonthContext inMarch() {
            expression.setMonth(MARCH);
            return new MonthContextBuilder();
        }

        @Override
        public MonthContext inApril() {
            expression.setMonth(APRIL);
            return new MonthContextBuilder();
        }

        @Override
        public MonthContext inMay() {
            expression.setMonth(MAY);
            return new MonthContextBuilder();
        }

        @Override
        public MonthContext inJune() {
            expression.setMonth(JUNE);
            return new MonthContextBuilder();
        }

        @Override
        public MonthContext inJuly() {
            expression.setMonth(JULY);
            return new MonthContextBuilder();
        }

        @Override
        public MonthContext inAugust() {
            expression.setMonth(AUGUST);
            return new MonthContextBuilder();
        }

        @Override
        public MonthContext inSeptember() {
            expression.setMonth(SEPTEMBER);
            return new MonthContextBuilder();
        }

        @Override
        public MonthContext inOctober() {
            expression.setMonth(OCTOBER);
            return new MonthContextBuilder();
        }

        @Override
        public MonthContext inNovember() {
            expression.setMonth(NOVEMBER);
            return new MonthContextBuilder();
        }

        @Override
        public MonthContext inDecember() {
            expression.setMonth(DECEMBER);
            return new MonthContextBuilder();
        }
    }
}
