// MOOC 15.0 Ex49; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 28 Oct 2019

import java.util.Scanner;

public class LastCharacter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.next();

        System.out.print("Last Letter: " + calculateCharacters(name));
    }
    public static char calculateCharacters(String text) {
        return text.charAt(text.length()-1);
    }
}
