package CodingTest_1.$R3TZCMG;

 public class Car extends Vehicle {
     private int seatingCapacity;

     public Car (String modelName, int maxSpeed, int seatingCapacity){
         super(modelName,maxSpeed);
         this.seatingCapacity = seatingCapacity;
     }

     @Override
     public void drive() {
         System.out.println("도로에서 운전 중입니다.");
     }
     public void airConditioning () {
         System.out.println("에어컨이 작동합니다.");
     }
 }
