package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius = 0;
        double area;
        Scanner input;
        boolean valid = false;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        while (!valid) {
            if (!input.hasNextDouble()) {
                System.out.println("Enter a valid double: ");
                input.next();
                valid = false;
            } else {
                radius = input.nextDouble();
                if (radius < 0) {
                    System.out.println("Enter a valid positive double: ");
                    valid = false;
                } else {
                    valid = true;
                }
            }
        }

        input.close();

        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
