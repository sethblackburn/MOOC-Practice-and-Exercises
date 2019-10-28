//MOOC 15.0 Ex47; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 28 Oct 2019

import java.util.Scanner;

public class NameLength {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.next();

        System.out.print("Number of characters: " + calculateCharacters(name));
    }
    public static int calculateCharacters(String text) {
        return text.length();
    }
}
