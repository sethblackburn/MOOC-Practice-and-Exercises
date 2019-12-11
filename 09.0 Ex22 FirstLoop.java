// MOOC 9 Exercise 22; 23 Sept 2019; first use of loops

import java.util.Scanner;

public class FirstLoop {
    public static void main(String[] args) {
        Scanner passInput = new Scanner(System.in);

        String saved = ("carrot");

        while (true) {
            System.out.print("Enter the password: ");
            String entered = passInput.next();

            if (entered.equalsIgnoreCase(saved)) {
                System.out.print("Right!\n\nThe secret is: Cake, and grief counseling, will be available at the conclusion of the test.");
                break;
            } else {
                System.out.print("Wrong!\n");
            }
        }
    }
}

