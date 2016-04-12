package com.cronexpression.model;

/**
 * @author Philipp Daniels
 */
public class Expression {

    private String minute;
    private String hour;
    private String dayOfMonth;
    private String month;
    private String dayOfWeek;

    public Expression setMinute(String minute) {
        this.minute = minute;
        return this;
    }

    public Expression setHour(String hour) {
        this.hour = hour;
        return this;
    }

    public Expression setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
        return this;
    }

    public Expression setMonth(String month) {
        this.month = month;
        return this;
    }

    public Expression setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }

    @Override
    public String toString() {
        return minute + ' ' + hour + ' ' + dayOfMonth + ' ' + month + ' ' + dayOfWeek;
    }
}
