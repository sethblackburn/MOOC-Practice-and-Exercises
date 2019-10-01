// MOOC 8.5 Exercise 19   https://materiaalit.github.io/2013-oo-programming/part1/week-1/

import java.util.Scanner;

public class ElseIfChain {
    public static void main(String[] args) {
        Scanner ageInput = new Scanner(System.in);

        System.out.print("Enter your current age: ");
        int age = ageInput.nextInt();

        if (age >= 0 && age < 5) {
            System.out.print("Wow. How are you using a computer?  Or this program?");
        } else if (age >= 5 && age < 14) {
            System.out.print("Do you have your parents' permission to be on the computer?");
        } else if (age >= 14 && age < 18) {
            System.out.print("Start teaching yourself how to code now and thank me later.");
        } else if (age >= 19 && age < 23) {
            System.out.print("I hope you're not majoring in English or something equally unuseful.");
        } else if (age >= 23 && age < 101) {
            System.out.print("Well alright then.");
        } else if (age >=101 && age < 123) {
            System.out.print("I seriously doubt that.");
        } else
            System.out.print("That's impossible. Don't lie.");
    }
}