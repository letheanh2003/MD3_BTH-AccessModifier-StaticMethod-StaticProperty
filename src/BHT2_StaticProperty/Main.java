package BHT2_StaticProperty;

public class Main {
    public static void main(String[] args) {
       // write your code here
        Car car1 = new Car("Mazda 3", "Skyactiv 3");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mazda 6", "Skyactiv 6");

        System.out.println(Car.numberOfCars);
    }
}
