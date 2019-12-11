// MOOC 15.1 Ex55; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 29 Oct 2019

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String firstWord = reader.nextLine();

        System.out.print("Type the second word: ");
        String secondWord = reader.nextLine();

        int index = firstWord.indexOf(secondWord);

        if (index >= 0) {
            System.out.print("The word '" + secondWord + "' is found in the word '" + firstWord + "'.");
        } else if (index < 0) {
            System.out.print("The word '" + secondWord + "' is not found in the word '" + firstWord + "'.");
        }
    }
}
