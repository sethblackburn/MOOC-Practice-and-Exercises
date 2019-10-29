// MOOC 15.1 Ex53; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 29 Oct 2019

import java.util.Scanner;

public class SubstringsA {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("How many characters should I remove from the beginning? Type a number: ");
        int length = reader.nextInt();

        String output = word.substring(0, length);

        System.out.print("Result: " + output);
    }
}
