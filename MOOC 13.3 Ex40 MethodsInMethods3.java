// MOOC 13.3 Ex 40.3; https://materiaalit.github.io/2013-oo-programming/part1/week-2/; four methods; prints an ASCII Christmas Tree

import java.util.Scanner;

public class MethodsInMethods3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        xmasTree(num);
    }
    private static void xmasTree(int height) {

        int spaceCount = (height - 1);
        int starCount = 1;

        while ((height * 2) >= starCount) {
            printWhiteSpaces(spaceCount);
            printStars(starCount);
            printWhiteSpaces(spaceCount);
            System.out.println();
            spaceCount -= 1;
            starCount += 2;
        }
        printWhiteSpaces(height -2);
        printStars(3);
        printWhiteSpaces(height - 2);
        System.out.println();
        printWhiteSpaces(height - 2);
        printStars(3);
        printWhiteSpaces(height - 2);
    }
    private static void printStars(int amount) {
        int count = 1;
        while (amount >= count) {
            count++;
            System.out.print("*");
        }
    }
    private static void printWhiteSpaces(int amount) {
        int count = 1;
        while (amount >= count) {
            count++;
            System.out.print(" ");
        }
    }
}
