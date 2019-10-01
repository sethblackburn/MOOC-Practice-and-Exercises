// MOOC 8.5 Exercise 20   https://materiaalit.github.io/2013-oo-programming/part1/week-1/

import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner textInput = new Scanner(System.in);

        System.out.print("Type your username: ");
        String username = textInput.next();

        System.out.print("Type your password: ");
        String password = textInput.next();

        if (username.equals("alex") && password.equals("mightyducks")) {
            System.out.print("You are now logged into the system!");
        }
    }
}