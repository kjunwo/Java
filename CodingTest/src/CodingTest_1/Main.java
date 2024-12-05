package CodingTest_1;

public class Main {
    public static void main(String[] args) {
        // Car 객체
        Car car = new Car("Tesla Model S", 250, 5);
        car.displayInfo();
        car.drive();
        car.airConditioning();

        System.out.println();

        // Truck 객체
        Truck truck = new Truck("Tesla Cybertruck", 180, 3);
        truck.displayInfo();
        truck.drive();
        truck.performMaintenance();

        System.out.println();

        // ElectricCar 객체
        ElectricCar electricCar = new ElectricCar("Nissan Leaf", 150, 5, 40);
        electricCar.displayInfo();
        electricCar.drive();
        electricCar.charge();
    }
}