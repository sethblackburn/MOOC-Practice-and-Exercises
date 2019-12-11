//MOOC 17.3 Ex58; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 30 Oct 2019

//This one had me drawing a blank at first, because I hadn't used .contains() beforehand.  There are lots of new methods and
//commands in short order at this stage of the MOOC course.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println();
        System.out.println("Let's enter a series of words.");
        System.out.println();

//Had to be careful in re-arranging the loop from the previous exercise.

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
                if (words.contains(word)) {
                    System.out.println("You gave the word " + word + " twice.");
                    break;
                }
            words.add(word);
        }
    }
}
