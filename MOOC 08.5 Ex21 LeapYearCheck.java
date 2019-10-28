// MOOC 8.5 Excercise 21; https://materiaalit.github.io/2013-oo-programming/part1/week-1/; 23 Sept 2019
// first program to contain of multiple checks in one if statement

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner yearInput = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = yearInput.nextInt();

        int fourCheck = year % 4;
        int hundredCheck = year % 100;
        int fourHundredCheck = year % 400;

        if ( (fourCheck == 0 && !(hundredCheck == 0) ) || (hundredCheck == 0 && fourHundredCheck == 0) ) {
            System.out.print("That year is a leap year.");
        } else {
            System.out.print("That year is not a leap year.");
        }
    }
}
