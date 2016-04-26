package com.cronexpression.meta;

/**
 * @author Philipp Daniels
 */
public class Expression {

    private String name;

    public Expression(String name) {
        this.name = name.toLowerCase();
    }

    public String getName() {
        return name;
    }
}
