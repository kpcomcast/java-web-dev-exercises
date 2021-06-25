package org.launchcode.java.exercises.datatypes;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,'" +
                " thought Alice 'without pictures or conversation?'";

        System.out.println("Search sentence for term: ");
        String term = input.nextLine();
        input.close();
        String sentenceLower = sentence.toLowerCase();
        String termLower = term.toLowerCase();

        System.out.println("The term was found: " + sentenceLower.contains(termLower));
        if (sentenceLower.contains(termLower)) {
            System.out.println("Index: " + sentenceLower.indexOf(term));
            String[] removed = sentenceLower.split(termLower);
            String newSentence = "";
            for (int i = 0; i < removed.length; i++) {
                newSentence = newSentence + removed[i];
            }
            System.out.println(newSentence);
        }

    }
}
