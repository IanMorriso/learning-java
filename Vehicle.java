public class Vehicle {
    int modelYear;
    String modelMake;
    String modelName;
    double modelPrice;

    public Vehicle(int year, String manufacturer, String name, double price) {
        modelYear = year;
        modelMake = manufacturer;
        modelName = name;
        modelPrice = price;
    }

    public static void main(String[] args) {
        Vehicle myCar = new Vehicle(2002, "Honda", "CR-V", 6000.00);
        System.out.println(myCar.modelYear + " " + myCar.modelMake + " " + myCar.modelName);
    }
}
