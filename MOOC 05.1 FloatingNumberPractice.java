// MOOC 5.1   https://materiaalit.github.io/2013-oo-programming/part1/week-1/

public class FloatingNumberPractice {
    public static void main(String[] args) {
        int first = 3;
        int second = 2;

        double result1 = (double)first / second;
        double result2 = first / (double)second;
        double result3 = (double)(first/second);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}