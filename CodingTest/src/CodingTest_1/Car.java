package CodingTest_1;

 public class Car extends Vehicle {
     int seatingCapacity;

     public Car (String modelName, int maxSpeed, int seatingCapacity){
         super(modelName,maxSpeed);
         this.seatingCapacity = seatingCapacity;
     }

     @Override
     void drive() {
         System.out.println("도로에서 운전 중입니다.");
     }
     void airConditioning () {
         System.out.println("에어컨이 작동합니다.");
     }
 }
