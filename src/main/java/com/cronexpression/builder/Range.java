package com.cronexpression.builder;

/**
 * @author Philipp Daniels
 */
public class Range {

    private static final Character SEPARATOR = '-';

    private int start;
    private int end;

    /**
     * @param start Start of range
     */
    public Range setStart(int start) {
        this.start = start;
        return this;
    }

    /**
     * @param end End of range
     */
    public Range setEnd(int end) {
        this.end = end;
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(start) + SEPARATOR + String.valueOf(end);
    }
}
