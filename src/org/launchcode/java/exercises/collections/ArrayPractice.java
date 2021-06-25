package org.launchcode.java.exercises.collections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};

        for (int i : someInts) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceArray = sentence.split("\\. ");
        System.out.println(sentenceArray[1]);
        System.out.println(Arrays.toString(sentenceArray));

    }
}
