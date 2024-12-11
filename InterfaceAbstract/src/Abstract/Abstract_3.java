package Abstract;

abstract class A {
    abstract void abc();
}

// 추상클래스의 객체 생성
// 원래 추상클래스는 그 자체로 인스턴스를 생성할 수 없음(자식클래스를 이용)
// But, 익명이너클래스를 이용하면 가능
public class Abstract_3 {
    public static void main(String[] args) {
        // 원래 외부에 A클래스를 상속받아 오버라이드를 구현해야하나,
        // 인스턴스를 한번만 사용할 목적으로 아래와 같이 익명이너클래스를 사용할 수 있음
        A a1 = new A() {
            @Override
            void abc() {
                System.out.println("익명이너클래스로 객체 생성");
            }
        };
        a1.abc();
        // 단점, a1말고 다른 인스턴스를 생성하려면 다시 익명이너클래스를 이용해야함
        A a2 = new A() {
            @Override
            void abc() {
                System.out.println("익명이너클래스 다시 생성");
            }
        };
    }
}
