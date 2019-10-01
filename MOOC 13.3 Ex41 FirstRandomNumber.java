//MOOC 13.3 Exercise 41; https://materiaalit.github.io/2013-oo-programming/part1/week-2/; number-guessing game

import java.util.Scanner;
import java.util.Random;

public class FirstRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int draw = random.nextInt(101);

        Scanner reader = new Scanner(System.in);
        textPrompt();
        int num = reader.nextInt();

        int count = 0;

        while (num != draw) {
            count++;
            if (num < draw) {
                System.out.println("The number is greater, guesses made: " + count);
                textPrompt();
                num = reader.nextInt();
            } else {
                System.out.println("The number is lesser, guesses made: " + count);
                textPrompt();
                num = reader.nextInt();
            }

        }
        System.out.println("Congratulations, your guess is correct!");
    }
    public static void textPrompt() {
        System.out.print("Guess a number between 0-100: ");
    }
}