// 전자장치 추상클래스
abstract class Device {
    String brand;
    String model;
    public Device() {
    }
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void powerOn() {
        System.out.println(brand + " " + model + "전원켜짐");
    }
    public void powerOff() {
        System.out.println(brand + " " + model + "전원꺼짐");
    }
    public abstract void doFunction() ; // 추상메서드
}
interface Wifi {
    void connectToWifi(); // 추상메서드
}
interface Bluetooth {
    void connectToBluetooth(); // 추상메서드
}
// 휴대폰
class Phone extends Device implements Wifi,Bluetooth{
    public Phone(String brand, String model) {
        super(brand, model);
    }
    @Override
    public void doFunction() {
        System.out.println("휴대폰이 전화를 겁니다");
    }
    @Override
    public void connectToWifi() {
        System.out.println("휴대폰으로 와이파이에 연결합니다");
    }
    @Override
    public void connectToBluetooth() {
        System.out.println("휴대폰으로 블루투스에 연결합니다");
    }
}
// 노트북
class Laptop extends Device implements Wifi {
    public Laptop(String brand, String model) {
        super(brand, model);
    }
    @Override
    public void doFunction() {
        System.out.println("노트북이 프로그램을 실행합니다");
    }
    @Override
    public void connectToWifi() {
        System.out.println("노트북으로 와이파이에 연결합니다");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Device phone = new Phone("삼성", "갤럭시 S24");
        Device laptop = new Laptop("Apple", "MacBook Pro");
        // 휴대폰
        phone.powerOn();
        phone.doFunction();
        // 동적바이딩이 부모클래스인 Device로 되어있으므로
        // connectToWiFi를 호출하기 위해 타입변환이 필요함
        ((Wifi)phone).connectToWifi();
        ((Bluetooth)phone).connectToBluetooth();
        phone.powerOff();
        // 노트북
        laptop.powerOn();
        laptop.doFunction();
        ((Wifi)laptop).connectToWifi();
        laptop.powerOff();
    }
}