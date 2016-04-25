package com.cronexpression.model;

/**
 * @author Philipp Daniels
 */
public class Factory {

    /**
     * @param value Integer value of a minute.
     * @return New Minute instance
     */
    public static Minute minute(int value) {
        return new Minute(value);
    }

    /**
     * @param value Integer value of an hour.
     * @return New Hour instance
     */
    public static Hour hour(int value) {
        return new Hour(value);
    }

    /**
     * @param value Integer value of an month.
     * @return New Month instance
     */
    public static Month month(int value) {
        return new Month(value);
    }

    /**
     * @param value Integer value of an day.
     * @return New Month instance
     */
    public static MonthDay day(int value) {
        return new MonthDay(value);
    }

    /**
     * @param value Integer value of an day.
     * @return New Month instance
     */
    public static WeekDay weekDay(int value) {
        return new WeekDay(value);
    }

    /**
     * @return Month instance for January
     */
    public static Month january() {
        return month(1);
    }

    /**
     * @return Month instance for February
     */
    public static Month february() {
        return month(2);
    }

    /**
     * @return Month instance for March
     */
    public static Month march() {
        return month(3);
    }

    /**
     * @return Month instance for April
     */
    public static Month april() {
        return month(4);
    }

    /**
     * @return Month instance for May
     */
    public static Month may() {
        return month(5);
    }

    /**
     * @return Month instance for June
     */
    public static Month june() {
        return month(6);
    }

    /**
     * @return Month instance for July
     */
    public static Month july() {
        return month(7);
    }

    /**
     * @return Month instance for August
     */
    public static Month august() {
        return month(8);
    }

    /**
     * @return Month instance for September
     */
    public static Month september() {
        return month(9);
    }

    /**
     * @return Month instance for October
     */
    public static Month october() {
        return month(10);
    }

    /**
     * @return Month instance for November
     */
    public static Month november() {
        return month(11);
    }

    /**
     * @return Month instance for December
     */
    public static Month december() {
        return month(12);
    }

    public static class Minute {

        private int value;

        protected Minute(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static class Hour {

        private int value;

        protected Hour(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static class Month {

        private int value;

        protected Month(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static class MonthDay {

        private int value;

        protected MonthDay(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static class WeekDay {

        private int value;

        protected WeekDay(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
