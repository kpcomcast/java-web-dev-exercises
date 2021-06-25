package org.launchcode.java.exercises.datatypes;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive: ");
        Double miles = input.nextDouble();
        System.out.println("How many gallons of gas did you use: ");
        Double gas = input.nextDouble();

        input.close();
        Double mpg = miles / gas;
        System.out.println("The miles per gallon is " + mpg + " mpg.");
    }
}
