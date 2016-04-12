package com.cronexpression;

/**
 * @author Philipp Daniels
 */
public interface YearContext {

    MonthContext inJanuary();

    MonthContext inFebruary();

    MonthContext inMarch();

    MonthContext inApril();

    MonthContext inMay();

    MonthContext inJune();

    MonthContext inJuly();

    MonthContext inAugust();

    MonthContext inSeptember();

    MonthContext inOctober();

    MonthContext inNovember();

    MonthContext inDecember();
}
