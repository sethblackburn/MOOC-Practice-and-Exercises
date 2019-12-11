// MOOC 13.3 Exercise 40.2; https://materiaalit.github.io/2013-oo-programming/part1/week-2/; four methods; prints a right-aligned right triangle in ASCII

import java.util.Scanner;

public class MethodsInMethods2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        printTriangle(num);
    }
    private static void printTriangle(int sideSize) {

        int spaceCount = (sideSize - 1);
        int starCount = 1;

        while (sideSize >= starCount) {
            printWhiteSpaces(spaceCount);
            printStars(starCount);
            System.out.println();
            spaceCount--;
            starCount++;
        }
    }
    private static void printStars(int amount) {
        int count = 1;
        while (amount >= count) {
            count++;
            System.out.print("*");
        }
    }
    private static void printWhiteSpaces(int size) {
        int count = 1;
        while (size >= count) {
            count++;
            System.out.print(" ");
        }
    }
}
