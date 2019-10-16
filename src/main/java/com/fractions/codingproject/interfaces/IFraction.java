package com.fractions.codingproject.interfaces;


/**
 * Specification to perform the arithmetic operations, equality and relational checks and display the result
 */
public interface IFraction {
    int getNumerator();

    int getDenominator();

    IFraction add(IFraction fractionTwo);


    IFraction subtract(IFraction fractionTwo);


    IFraction multiply(IFraction fractionTwo);


    IFraction divide(IFraction fractionTwo);

    void displayResult();

    void compareValues(IFraction fractionTwo);
}
