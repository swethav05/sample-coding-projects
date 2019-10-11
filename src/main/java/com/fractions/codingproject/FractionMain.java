package com.fractions.codingproject;

import com.fractions.codingproject.impl.IntegerFractionImpl;
import com.fractions.codingproject.interfaces.IFraction;

import java.util.Scanner;

/**
 * Main program to run the {@link IFraction} operations
 */
public class FractionMain {
    private static final String FIRST_VALUE = "first";
    private static final String SECOND_VALUE = "second";

    public static void main(String[] args) {
        IFraction<Integer> fraction = new IntegerFractionImpl<Integer>();
        int value1, value2;

        value1 = getIntegerValue(FIRST_VALUE);
        value2 = getIntegerValue(SECOND_VALUE);
        fraction.add(value1, value2);
        fraction.subtract(value1, value2);
        fraction.multiply(value1, value2);
        fraction.divide(value1, value2);
        fraction.compareValues(value1, value2);
        fraction.display();

    }

    /**
     * This method gets the inputs from the user.
     *
     * @param valueOrder This tells input value order {{@link #FIRST_VALUE} (OR) {@link #SECOND_VALUE}. This is used in
     *                   printing the message to the user
     * @return
     */
    private static Integer getIntegerValue(String valueOrder) {

        System.out.println("Enter the " + valueOrder + " integer value to perform arithmetic operations");
        Scanner in = new Scanner(System.in);
        String string1 = in.nextLine();
        try {
            return Integer.valueOf(string1);
        } catch (NumberFormatException ex) {
            System.out.println("Not a valid Integer value");
            return getIntegerValue(valueOrder);
        }
    }
}
