package CodingTest_1.$R3TZCMG;

public class Truck extends Vehicle implements Maintenance {
     private int loadCapacity;

    public Truck(String modelName, int maxSpeed, int loadCapacity) {
        super(modelName, maxSpeed);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void drive() {
        System.out.println("화물을 싣고 운전 중입니다.");
    }
    @Override
    public void performMaintenance() {
        System.out.println("트럭 유지보수를 수행 중입니다.");
    }
}
