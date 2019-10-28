// MOOC 15.0 Ex48; https://materiaalit.github.io/2013-oo-programming/part1/week-3/

import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.next();

        System.out.print("First Letter: " + calculateCharacters(name));
    }
    public static char calculateCharacters(String text) {
        return text.charAt(0);
    }
}
