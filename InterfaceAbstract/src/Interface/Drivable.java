package Interface;

// 운전 인터페이스
// 인터페이스는 파일이름으로 존재함
// 단, main메서드는 만들 수 없음
interface Drivable {
    void drive(); // 추상메서드
}
class Vehicle {} // 이동수단 클래스

class Car extends Vehicle implements Drivable {
    @Override
    public void drive() {
        System.out.println("자동차는 엔진으로 이동");
    }
}
class Bike extends Vehicle implements Drivable {
    @Override
    public void drive() {
        System.out.println("자전거는 페달을 움직여서 이동");
    }
}