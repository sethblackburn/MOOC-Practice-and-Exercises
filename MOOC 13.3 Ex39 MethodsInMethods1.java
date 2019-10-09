// MOOC 13.3 Excercise 39; https://materiaalit.github.io/2013-oo-programming/part1/week-2/; three methods; prints a left-aligned right triangle in ASCII

import java.util.Scanner;

public class MethodsInMethods1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        printTriangle(num);
    }
    private static void printStars(int amount) {
        int count = 1;
        while (amount >= count) {
            count++;
            System.out.print("*");
        }
        System.out.println();
    }
    private static void printTriangle(int sideSize){
        int count = 1;
        while (sideSize >= count) {
            printStars(count);
            count++;
        }
    }
}
