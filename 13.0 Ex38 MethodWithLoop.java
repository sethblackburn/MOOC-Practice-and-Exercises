// MOOC 13.0 Exercise 38; 25 Sept 2019

import java.util.Scanner;

public class MethodWithLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int count = 1;

        System.out.println("How many?");
        int amount = reader.nextInt();

        while (count <= amount) {
            printText();
            count++;
        }
    }
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe, and Java.");
    }
}
