package com.cronexpression.model;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.LinkedList;

/**
 * @author Philipp Daniels
 */
public class List {

    private static final Character SEPARATOR = ',';

    private java.util.List<String> entries = new LinkedList<>();

    public List add(int value) {
        entries.add(String.valueOf(value));
        return this;
    }

    public List add(Range value) {
        entries.add(value.toString());
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String sep = "";
        for (String s : entries) {
            sb.append(sep).append(s);
            sep = String.valueOf(SEPARATOR);
        }
        return sb.toString();
    }
}
