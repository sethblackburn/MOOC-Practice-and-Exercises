//MOOC 17.5 ArrayMethodPracticeTwo; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 11 Dec 2019

//Okay, so this is started to make sense.  When you create a method, it has its own variable in its creation.
//Then, when you call that method, you input a value which defines that variable within that method.  Here, the same
//method is used twice, with the internal variable "stringArrayInput" but it uses the value of the array "languageslist"
//as the value of "stringArrayInput" and THEN uses "countriesList" in the same space.

import java.util.ArrayList;

public class ArrayMethodPracticeTwo {
    public static void main(String[] args) {
        ArrayList<String> languagesList = new ArrayList<String>();
        languagesList.add("Java");
        languagesList.add("Python");
        languagesList.add("Ruby");
        languagesList.add("C++");

        ArrayList<String> countriesList = new ArrayList<String>();
        countriesList.add("Finland");
        countriesList.add("Sweden");
        countriesList.add("Norway");

        print(languagesList);

        print(countriesList);
    }
    public static void print(ArrayList<String> stringArrayInput) {
        for (String word : stringArrayInput) {
            System.out.println( word );
        }
    }
}
