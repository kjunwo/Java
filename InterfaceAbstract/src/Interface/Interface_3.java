package Interface;
// 인터페이스 사용
// 인터페이스의 객체 생성 #1. 자식클래스의 생성자를 이용하는 방법
interface B1 {
    int a = 3; // 인터페이스의 정적상수필드는 반드시 초기값이 필요함
    void abc(); // abstract가 없어도 자동으로 추상메서드임
}
class B2 implements B1 {
    @Override
    public void abc() {
        System.out.println("인터페이스 B1의 자식클래스");
    }
}

public class Interface_3 {
    public static void main(String[] args) {
        // B1 value1 = new B1(); // 인스턴스화할 수 없음 (인터페이스는 생성자 없음)
        B1 value2 = new B2(); // B2클래스를 인스턴스화하고 B1으로 업캐스팅
        B2 value3 = new B2();
        value2.abc(); // 인터페이스 B1의 자식클래스
        value3.abc(); // 인터페이스 B1의 자식클래스
        }
    }

