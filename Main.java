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
    }
}