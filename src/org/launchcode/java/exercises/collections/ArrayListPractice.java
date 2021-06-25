package org.launchcode.java.exercises.collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceArray = sentence.split("\\. |, | ");
        ArrayList<String> sentenceList = new ArrayList<String>(Arrays.asList(sentenceArray));

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(5);
        integers.add(8);
        integers.add(13);
        integers.add(21);
        integers.add(34);
        integers.add(55);

        System.out.println(sumArrayList(integers));

        Scanner input = new Scanner(System.in);
        System.out.print("Word length to find: ");
        Integer response = input.nextInt();
        input.close();

        printFiveLetterWords(sentenceList, response);

    }

    public static Integer sumArrayList(ArrayList<Integer> array) {
        Integer sum = 0;
        for (Integer i : array) {
            sum += i;
        }
        return sum;
    }

    public static void printFiveLetterWords(ArrayList<String> array, Integer num) {
        for (String j : array) {
            if (j.length() == num) {
                System.out.println(j);
            }
        }
    }
}
