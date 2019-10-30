import java.util.Scanner;

public class AStringRecognitionPractice {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type an animal and press 'Enter': ");
            String animal = reader.next();

            if (animal.equalsIgnoreCase("dog")) {
                System.out.println(animal + " says bow-wow.");
                break;
            } else if (animal.equalsIgnoreCase("cat")) {
                System.out.println(animal + " says meow.");
                break;
            } else if (animal.equalsIgnoreCase("dolphin")) {
                System.out.println("A " + animal + " can make over 2,000 squeaks per second.");
                break;
            } else if (animal.equalsIgnoreCase("fox")) {
                System.out.println("What DOES the " + animal + " say?");
                break;
            } else System.out.println("I'm afraid I haven't been programmed to recognize that animal. Let's try again.");
        }
    }
}
