package com.fractions.codingproject;

import com.fractions.codingproject.impl.Fraction;
import com.fractions.codingproject.interfaces.IFraction;

/**
 * Main program to run the {@link IFraction} operations
 */
public class FractionMain {

    public static void main(String[] args) {
        Fraction f1 = new Fraction(-25, 35);
        Fraction f2 = new Fraction(3, 7);
        f1.compareValues(f2);
        IFraction f3 = f1.add(f2);
        System.out.println("Addition of " + f1 + " and " + f2 + " is : " + f3);

        f3 = f1.subtract(f2);
        System.out.println("Subtraction of " + f1 + " and " + f2 + " is : " + f3);

        f3 = f1.divide(f2);
        System.out.println("Division of " + f1 + " and " + f2 + " is : " + f3);

        f3 = f1.multiply(f2);
        System.out.println("Multiplication of " + f1 + " and " + f2 + " is : " + f3);

        Fraction f4 = new Fraction(-4, 8);

        //Display method can be used to display the final result of the below operation instead of printing it manually
        f1.add(f2).multiply(f4).subtract(f2).displayResult();
    }
}

