// MOOC 15.0 Ex50; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 28 Oct 2019

import java.util.Scanner;

public class SeperatingCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.next();

        int counter = 0;

        if (name.length() > 2) {
            while (counter < 3) {
                System.out.println((counter + 1) + ". character: " + name.charAt(counter));
                counter++;
            }
        }
    }
}
