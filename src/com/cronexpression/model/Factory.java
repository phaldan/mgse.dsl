package com.cronexpression.model;

/**
 * @author Philipp Daniels
 */
public class Factory {

    /**
     * @param value Integer value of a minute.
     * @return New Minute instance
     */
    public static Minute Minute(int value) {
        return new Minute(value);
    }

    /**
     * @param value Integer value of an hour.
     * @return New Hour instance
     */
    public static Hour Hour(int value) {
        return new Hour(value);
    }

    /**
     * @param value Integer value of an month.
     * @return New Month instance
     */
    public static Month Month(int value) {
        return new Month(value);
    }

    /**
     * @param value Integer value of an day.
     * @return New Month instance
     */
    public static MonthDay Day(int value) {
        return new MonthDay(value);
    }

    /**
     * @param value Integer value of an day.
     * @return New Month instance
     */
    public static WeekDay WeekDay(int value) {
        return new WeekDay(value);
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
