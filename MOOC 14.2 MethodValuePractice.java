// MOOC 14.2; https://materiaalit.github.io/2013-oo-programming/part1/week-3/

public class MethodValuePractice {
    public static void main(String[] args) {
        String first = method();
        System.out.println(first);
    }
    public static String method() {
        System.out.println("This is the text that is output when method() is executed.");
        return "This is the return value of method().";
    }
}
