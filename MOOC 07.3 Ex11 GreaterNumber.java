// MOOC 7.3 Exercise 11   https://materiaalit.github.io/2013-oo-programming/part1/week-1/

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);

        System.out.print("Type a number between 0 and 2147483647: ");
        int firstNumber = numInput.nextInt();

        System.out.print("Type another number between 0 and 2147483647: ");
        int secondNumber = numInput.nextInt();

        System.out.println("The larger of the two numbers is: " + (Math.max(firstNumber,secondNumber)));
    }
}