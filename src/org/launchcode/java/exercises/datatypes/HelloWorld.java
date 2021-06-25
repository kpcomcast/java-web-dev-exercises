package org.launchcode.java.exercises.datatypes;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is your name: ");
        String response = input.nextLine();
        input.close();
        System.out.println("Hello " + response);
    }
}
