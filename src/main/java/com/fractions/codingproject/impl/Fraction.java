package com.fractions.codingproject.impl;

import com.fractions.codingproject.Utils;
import com.fractions.codingproject.interfaces.IFraction;
import com.fractions.codingproject.model.ComparisionType;

import java.util.Objects;

/**
 * This is the implementation class performing the arithmetic operations, equality and relational checks and display the
 * result
 */
public class Fraction implements IFraction {

    /***
     * stores the fraction numerator
     *
     */
    private final int numerator;

    /***
     * stores the fraction denominator
     *
     */
    private final int denominator;

    /**
     * This tells whether to normalize the fraction or not
     * Ex: numerator = 4 and denominator = 6 => normalized fraction = 2/3
     */
    private final boolean normalizeFractions;

    /**
     * Constructor that takes in numerator to create a fraction.
     *
     * @param numerator
     */
    public Fraction(int numerator) {
        this(numerator, 1, true);
    }

    /**
     * Constructor that takes in numerator and denominator to create a fraction.
     *
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        this(numerator, denominator, true);
    }

    /**
     * Constructor that takes in numerator to create a fraction.
     *
     * @param numerator
     * @param denominator
     * @param normalizeFractions If true the fraction will always be normalized.
     *                           Ex: numerator = 4 and denominator = 6 => normalized fraction = 2/3
     */
    public Fraction(int numerator, int denominator, boolean normalizeFractions) {
        throwExceptionIfDenominatorIsZero(denominator);
        this.normalizeFractions = normalizeFractions;
        //check if the numerator = 0
        if (numerator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        } else {
            int hcf = 1;
            //check if the fraction has to be normalized
            if (normalizeFractions) {
                hcf = Utils.computeHCF(numerator, denominator);
            }
            // denominator should be positive
            if (denominator < 0) {
                this.numerator = -1 * numerator / hcf;
                this.denominator = -1 * denominator / hcf;
            } else {
                this.numerator = numerator / hcf;
                this.denominator = denominator / hcf;
            }
        }
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    /**
     * Add two fractions, "this" and fractionTwo.
     *
     * @param fractionTwo fractionTwo will be added to the fraction "this"
     * @return A Fraction with the sum of the two fractions "this" & fractionTwo
     */
    @Override
    public IFraction add(IFraction fractionTwo) {
        int numerator = (getNumerator() * fractionTwo.getDenominator()) +
                (fractionTwo.getNumerator() * getDenominator());

        int denominator = getDenominator() * fractionTwo.getDenominator();

        Fraction f = new Fraction(numerator, denominator, this.normalizeFractions);
        return f;
    }

    /**
     * Subtract two fractions, "this" and fractionTwo.
     *
     * @param fractionTwo fractionTwo will be subtracted from the fraction "this"
     * @return A Fraction with the difference of the two fractions "this" & fractionTwo
     */
    @Override
    public IFraction subtract(IFraction fractionTwo) {
        int newNumerator = (getNumerator() * fractionTwo.getDenominator()) -
                (fractionTwo.getNumerator() * getDenominator());
        int newDenominator = getDenominator() * fractionTwo.getDenominator();
        return new Fraction(newNumerator, newDenominator, this.normalizeFractions);
    }

    /**
     * Multiplication two fractions, "this" and fractionTwo.
     *
     * @param fractionTwo fractionTwo will be multiplied to the fraction "this"
     * @return A Fraction with the product of the two fractions "this" & fractionTwo
     */
    @Override
    public IFraction multiply(IFraction fractionTwo) {
        int newNumerator = getNumerator() * fractionTwo.getNumerator();
        int newDenominator = getDenominator() * fractionTwo.getDenominator();
        return new Fraction(newNumerator, newDenominator, this.normalizeFractions);
    }

    /**
     * Division two fractions, "this" and fractionTwo.
     *
     * @param fractionTwo Fraction "this" will be deivided by fractionTwo
     * @return A Fraction with the divided result of the two fractions "this" & fractionTwo
     */
    @Override
    public IFraction divide(IFraction fractionTwo) {
        int newNumerator = getNumerator() * fractionTwo.getDenominator();
        int newDenominator = getDenominator() * fractionTwo.getNumerator();
        return new Fraction(newNumerator, newDenominator, this.normalizeFractions);
    }

    /**
     * This will display the final result
     */
    @Override
    public void displayResult() {
        System.out.print("The final result is: " + this.toString());
    }

    /**
     * This compares two fractions, "this" and fractionTwo and prints the result
     *
     * @param fractionTwo
     */
    @Override
    public void compareValues(IFraction fractionTwo) {
        IFraction result = this.subtract(fractionTwo);
        ComparisionType comparisionType;
        if (result.getNumerator() == 0) {
            comparisionType = ComparisionType.EQUAL_TO;
        } else if (result.getNumerator() > 0) {
            comparisionType = ComparisionType.GREATER_THAN;
        } else {
            comparisionType = ComparisionType.LESS_THAN;
        }
        System.out.println(this + " is " + comparisionType.getComparisionType() + fractionTwo);
    }

    /**
     * Equals method to compare the two fractions, "this" and fractionTwo
     *
     * @param fractionTwo
     * @return
     */
    @Override
    public boolean equals(Object fractionTwo) {
        if (!(fractionTwo instanceof Fraction))
            return false;
        Fraction f = ((Fraction) fractionTwo);
        int hcfForFraction1 = 1;
        int hcfForFraction2 = 1;

        /**
         * Get the Highest Common Factor if the "this" fraction is not normalized
         */
        if (!this.normalizeFractions) {
            hcfForFraction1 = Utils.computeHCF(getNumerator(), getDenominator());
        }

        /**
         * Get the Highest Common Factor if the fractionTwo  is not normalized
         */
        if (!f.normalizeFractions) {
            hcfForFraction2 = Utils.computeHCF(f.getNumerator(), f.getDenominator());
        }

        //normalize and compare the fractions
        return Objects.equals(this.numerator / hcfForFraction1, f.numerator / hcfForFraction2) &&
                Objects.equals(this.denominator / hcfForFraction1, f.denominator / hcfForFraction2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.numerator, this.denominator);
    }

    @Override
    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }

    /**
     * Throws and exception if the denominator is zero
     *
     * @param denominator
     */
    private void throwExceptionIfDenominatorIsZero(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
    }
}