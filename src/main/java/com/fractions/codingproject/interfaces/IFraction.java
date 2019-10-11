package com.fractions.codingproject.interfaces;

/**
 * Specification to perform the arithmetic operations, equality and relational checks and display the result
 *
 * @param <T>
 */
public interface IFraction<T extends Number> {
    void add(T value1, T value2);

    void subtract(T value1, T value2);

    void multiply(T value1, T value2);

    void divide(T value1, T value2);

    void compareValues(T value1, T value2);

    void display();
}
