//MOOC 17.1 Array Practice; 30 Oct 2019

import java.util.ArrayList;

//Base code is copy/pasted from "https://materiaalit.github.io/2013-oo-programming/part1/week-3/" into the IDE to experiment with.

public class AnArrayPractice {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<String>();

        teachers.add("Anthony");
        teachers.add("Barto");
        teachers.add("Paul");
        teachers.add("John");
        teachers.add("Martin");
        teachers.add("Matt");

        //At this point, Anthony is 0, Barto is 1, Paul is 2, John is 3, Martin is 4, and Matt is 5.

        System.out.println("the number of teachers " + teachers.size() );

        System.out.println("first teacher on the list " + teachers.get(0));
        System.out.println("third teacher on the list " + teachers.get(2));

        //.get() extracts a string from this string array, analogous to the way .charAt() extracts a character from a String

        teachers.remove("Barto");

        //It wasn't clear on MOOC whether .remove() left a "hole" in the array or if it automatically re-ordered the array.
        //I suspect that it would automatically re-order, but I experimented below to be sure.

        if (teachers.contains("Barto")) {
            System.out.println("Barto is on the teachers list");
        } else {
            System.out.println("Barto is not on the teachers list");
        }

        //I added the following code to see what it would generate:

        System.out.println(teachers.get(1));

        //After compiling and running, the program generated "Paul." Suspicion Confirmed. After teachers.remove("Barto"),
        //Paul became 1, John became 2, and so on.  It would seem that arrays may never have empty values.
    }
}
