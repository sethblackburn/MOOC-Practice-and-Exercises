// MOOC 15.0 Ex52; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 28 Oct 2019
// I like this one a lot.  The loop is very compact.

import java.util.Scanner;

public class NameReverser {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int counter = 1;

        System.out.print("In reverse order: ");

        while (counter <= name.length()) {
            System.out.print(name.charAt(name.length() - counter));
            counter++;
        }
    }
}
