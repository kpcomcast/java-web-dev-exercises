package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String sentence = "";

        try {
            File text = new File("src/org/launchcode/java/studios/countingcharacters/stringExample.txt");
            Scanner myReader = new Scanner(text);
            while(myReader.hasNextLine()) {
                sentence += myReader.nextLine();
            }
            System.out.println(sentence);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Type out a string: ");
        String response = input.nextLine();
        if (!response.equals("")) {
            sentence = response;
        }
        input.close();

        char[] sentenceCharacters = sentence.toCharArray();
        Arrays.sort(sentenceCharacters);
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char i : sentenceCharacters) {
            i = Character.toLowerCase(i);
            if (Character.toString(i).matches("[a-z]")) {
                charCount.put(i, 0);
            }
//            charCount.put(i, 0);
        }

        for (char j : sentenceCharacters) {
            j = Character.toLowerCase(j);
            if (Character.toString(j).matches("[a-z]")) {
                Integer num = charCount.get(j) + 1;
                charCount.put(j, num);
            }
        }

        for (Map.Entry<Character, Integer> count : charCount.entrySet()) {
            System.out.println("Character: " + count.getKey() + " Count: " + count.getValue());
        }



    }
}
