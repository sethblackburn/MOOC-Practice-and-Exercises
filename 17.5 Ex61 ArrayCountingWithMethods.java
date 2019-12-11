// MOOC 17.5 Ex61; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 11 Dec 2019

// Methods are really starting to make sense now.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");

        System.out.println("There are this many items in the list: " + counter(list));
    }
    private static int counter(ArrayList<String> stringArrayInput) {
        return stringArrayInput.size();
        }
    }
