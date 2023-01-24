/*
 * In this program, I am running through a tutorial to learn Java syntax, as well as the main differences in Java compared to C and Python
 * Author: Ian Morrison
 * Reference: https://www.w3schools.com/java/default.asp
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Conditions and loops
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }
        
        int time = 20;
        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result);

        String[] cars = {"Volvo", "Ford", "BMW", "Mercury"};
        for (String i : cars) {
            System.out.println(i);
        }

        // Method test
        System.out.println("He still thinks he is " + myMethod("Ian", 29));

        // Overloading test
        System.out.println(plusMethod(2, 3));
        System.out.println(plusMethod(3.2, 5.6));

        // Recursion test
        System.out.println(fib(6));
    }

    static int myMethod(String fname, int age) {
        System.out.println(fname + " has called this method. He is " + age + " years old.");
        int desired_age = 24;
        return desired_age;
    }

    // Method overloading
    static int plusMethod(int x, int y) {
        return x = y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }

    // Recursive function
    public static int fib(int n) {
        // Base case
        if (n < 2) {
            return n;
        }
        // Recursion
        return fib(n-1) + fib(n-2);
    }
}