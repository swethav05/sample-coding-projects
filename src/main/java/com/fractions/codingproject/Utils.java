package com.fractions.codingproject;

public class Utils {

    /**
     * Calculates the Highest Common Factor(HCF) of two numbers using Euclids algorithm
     *
     * @param number1
     * @param number2
     * @return highest common factor
     */
    public static int computeHCF(int number1, int number2) {
        if (number2 == 0) {
            //always return a positive value
            return Math.abs(number1);
        }
        return computeHCF(number2, number1 % number2);
    }


}
