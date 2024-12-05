package CodingTest_1;

abstract class Vehicle {
    String modelName;
    int maxSpeed;

    public Vehicle (String modleName, int maxSpeed) {
        this.modelName = modleName;
        this.maxSpeed = maxSpeed;
    }
    abstract void drive();

    final void displayInfo(){
        System.out.println("Modal : " + modelName + ", " + "Max Speed : " + maxSpeed);
    }
}
