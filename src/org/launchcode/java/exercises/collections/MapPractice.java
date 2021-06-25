package org.launchcode.java.exercises.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> studentIds = new HashMap<>();
        String newStudent;
        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Type student name, then press enter, then student ID: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                Integer id = input.nextInt();
                studentIds.put(newStudent, id);
                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();
        for (Map.Entry<String, Integer> student : studentIds.entrySet()) {
            System.out.println(student.getKey() + " has ID #: " + student.getValue());
        }



    }
}
