// MOOC 7.1   https://materiaalit.github.io/2013-oo-programming/part1/week-1/

import java.util.Scanner;

public class FirstInputPractice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What is your name?");

        String name = reader.nextLine();

        System.out.println("Hello " + name + ", I am a very simple Java program that can act like it's talking to you.");
    }
}