// MOOC 13.1; 25 Sept 2019

public class ParameterPractice {
    public static void main(String[] args) {
        
	String name1 = "Anne";
        String name2 = "Green";
        greet(name1 + " " + name2);

        int age = 24;
        greet("John of " + age + " years");

    }
    public static void greet(String name) {
        System.out.println("Hi " + name + ", greetings from the world of methods!");
    }
}
