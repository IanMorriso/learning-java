/*
 * In this program, I am running through a tutorial to learn Java syntax, as well as the main differences in Java compared to C and Python
 * Author: Ian Morrison
 * Reference: https://www.w3schools.com/java/default.asp
 */

public class Main {
    int x;
    int y;
    double pi;

    public Main(double pie) {
        x = 5;
        y = 10;
        final double pi = pie;
    }

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


        // Objects
        Main myObj = new Main(3.1415);
        myObj.x = 40;
        System.out.println(myObj.x);
        System.out.println(myObj.pi);

        myStaticMethod(); // This works as we don't need to call it with an object

        myObj.myPublicMethod(); // We need to call the pulic method on the object
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

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }


    public void full_throttle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void max_speed(int maximum) {
        System.out.println("Max speed is: " + maximum);
    }
}