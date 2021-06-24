package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Area {
    public static void main(String[] args) {
        double radius = 0;
        double area;
        Scanner input;
        boolean valid = false;
        Pattern p = Pattern.compile(".");

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        while (!valid) {
            String stuff = input.nextLine();
            if (stuff.contains(" ") || stuff.isEmpty() || !stuff.matches("(.*)[0-9](.*)")) {
                System.out.println("No blanks, spaces, or other characters. Only numbers.");
                valid = false;
            } else if (Double.valueOf(stuff) <= 0) {
                System.out.println("Positive values please.");
                valid = false;
            } else {
                System.out.println("Thanks for the number!");
                radius = Double.valueOf(stuff);
                valid = true;
            }
        }


//        while (!valid) {
//            if (!input.hasNextDouble() && input.hasNextLine()) {
//                System.out.println("Enter a valid double: ");
//                input.next();
//                valid = false;
//            } else {
//                radius = input.nextDouble();
//                if (radius < 0) {
//                    System.out.println("Enter a valid positive double: ");
//                    valid = false;
//                } else {
//                    valid = true;
//                }
//            }
//        }

        input.close();

        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
