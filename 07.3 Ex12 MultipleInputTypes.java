// MOOC 7.3 Exercise 12; https://materiaalit.github.io/2013-oo-programming/part1/week-1/

import java.util.Scanner;

public class MultipleInputTypes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Type your name: ");
        String nOne = userInput.next();

        System.out.print("Type your age: ");
        int aOne = userInput.nextInt();

        System.out.println("");

        System.out.print("Type your name: ");
        String nTwo = userInput.next();

        System.out.print("Type your age: ");
        int aTwo = userInput.nextInt();

        int ages = aOne + aTwo;

        System.out.println("");

        System.out.print(nOne + " and " + nTwo + " are " + ages + " years old in total.");
    }
}
