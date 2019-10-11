package com.fractions.codingproject.impl;

import com.fractions.codingproject.interfaces.IFraction;
import com.fractions.codingproject.model.ComparisionType;

/**
 * This is the implementation class performing the arithmetic operations, equality and relational checks and display the result
 */
public class IntegerFractionImpl<U extends Number> implements IFraction<U> {
    private Float additionValue, subtractionValue, multiplicationValue, divisionValue;
    private ComparisionType comparisionType;

    /**
     * This method performs addition of the input values
     *
     * @param value1
     * @param value2
     */
    public void add(U value1, U value2) {
        additionValue = value1.floatValue() + value2.floatValue();
    }

    /**
     * This method performs subtraction of the input values
     *
     * @param value1
     * @param value2
     */
    public void subtract(U value1, U value2) {
        subtractionValue = value1.floatValue() - value2.floatValue();
    }


    /**
     * This method performs multiplication of the input values
     *
     * @param value1
     * @param value2
     */
    public void multiply(U value1, U value2) {
        multiplicationValue = value1.floatValue() * value2.floatValue();
    }

    /**
     * This method performs division of the input values
     *
     * @param value1
     * @param value2
     */

    public void divide(U value1, U value2) {
        divisionValue = value1.floatValue() / value2.floatValue();
    }

    /**
     * This method compares(equality and relational check) the two input values.
     *
     * @param value1
     * @param value2
     */
    public void compareValues(U value1, U value2) {
        if (value1.floatValue() > value2.floatValue()) {
            comparisionType = ComparisionType.GREATER_THAN;
        } else if (value1.floatValue() < value2.floatValue()) {
            comparisionType = ComparisionType.LESS_THAN;
        } else {
            comparisionType = ComparisionType.EQUAL_TO;
        }
    }

    /**
     * This will display the results of all the operations performed in the {@link com.fractions.codingproject.FractionMain}
     */
    public void display() {
        if (null != additionValue) {
            System.out.println("Addition value : " + additionValue);
        }

        if (null != subtractionValue) {
            System.out.println("Subtraction value : " + subtractionValue);
        }

        if (null != multiplicationValue) {
            System.out.println("Multiplication value : " + multiplicationValue);
        }

        if (null != additionValue) {
            System.out.println("Division value : " + divisionValue);
        }

        if (null != comparisionType) {
            System.out.println("First value is " + comparisionType.getComparisionType() + " second value");
        }
    }
}

