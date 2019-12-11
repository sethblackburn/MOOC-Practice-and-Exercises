//MOOC 17.5 ArrayMethodPractice; https://materiaalit.github.io/2013-oo-programming/part1/week-3/ 11 Dec 2019

//Method input and output is my weakness at this point, though it does make more sense as I go on. Just gotta keep going.

import java.util.Collections;
import java.util.ArrayList;

public class ArrayMethodPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("Ruby");
        list.add("C++");

        print(list);
    }
    public static void print(ArrayList<String> stringArrayInput) {
        for (String word : stringArrayInput) {
            System.out.println( word );
        }
    }
}
