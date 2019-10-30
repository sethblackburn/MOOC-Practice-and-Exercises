// MOOC 15.1 Substring Practice; https://materiaalit.github.io/2013-oo-programming/part1/week-3/; 28 Oct 2019

public class Main {
    public static void ASubstringPractice (String[] args) {
        String word = "antidisestablishmentarianism";
        
        String end = word.substring(25); //starts at 25, goes to the end, extracts value "ism" for String end
        String start = word.substring(0,4); //starts at 0, ends at 4, extracts "anti" for String start

        System.out.println(end);
        System.out.println(start);
    }
}
