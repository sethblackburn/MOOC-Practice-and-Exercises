//MOOC 17.3 Ex57; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 30 Oct 2019

//This one was a bit tricky. The loops were simple enough, but this was my first exercise using an array, a for-loop,
//and .empty checks all at once.  Fortunately, it still compiled and executed perfectly first try.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println();
        System.out.println("Let's enter a series of words. Type a word and press ENTER or press ENTER on a blank entry to end the series.");
        System.out.println();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
                if (word.isEmpty()) {
                break;
                }
            words.add(word);
        }

        System.out.println();
        System.out.println("You typed the following words: ");

        for (String list : words) {
            System.out.println(list);
        }
    }
}
