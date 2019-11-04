//MOOC 17.4 Ex59; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 4 Nov 2019

//This is one came fairly easy.  Largely a re-capitulation of earlier stuff.

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println();
        System.out.println("Let's enter a series of words.");
        System.out.println();

//Brought back the loop from Exercise 57. It's an incredibly useful one for building a String array.

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
                if (word.isEmpty()) {
                    break;
                }
            words.add(word);
        }

        Collections.reverse(words);

        for (String list : words) {
            System.out.println(list);
        }
    }
}
