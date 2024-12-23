package CodingTest_1.$R3TZCMG;

abstract class Vehicle {
    private String modelName;
    private int maxSpeed;

    public Vehicle (String modleName, int maxSpeed) {
        this.modelName = modleName;
        this.maxSpeed = maxSpeed;
    }
    public abstract void drive();

    public final void displayInfo(){
        System.out.println("Modal : " + modelName + ", " + "Max Speed : " + maxSpeed);
    }
}
