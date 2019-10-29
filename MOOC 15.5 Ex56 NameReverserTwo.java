// MOOC 15.5 Ex56; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 29 Oct 2019
// Mirrors Ex52, but uses a seperate method

import java.util.Scanner;

public class NameReverserTwo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a text: ");
        String text = reader.nextLine();

        reverse(text);
    }
    public static void reverse(String text) {
        int counter = 1;
        while (counter <= text.length()) {
            System.out.print(text.charAt(text.length() - counter));
            counter++;
        }
    }
}
