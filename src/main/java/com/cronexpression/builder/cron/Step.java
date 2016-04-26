package com.cronexpression.builder.cron;

/**
 * @author Philipp Daniels
 */
public class Step {

    private static final Character SEPARATOR = '/';

    private int step;
    private String value;

    public Step setStep(int step) {
        this.step = step;
        return this;
    }

    public Step setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return value + SEPARATOR + String.valueOf(step);
    }
}
