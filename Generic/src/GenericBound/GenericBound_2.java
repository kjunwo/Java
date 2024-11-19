package GenericBound;

class A2 {
    public <T extends Number> void method1(T t) {
        System.out.println(t.intValue());
    }
}
interface MyInterface {
    public abstract void print();
}
class B2 {
    // *** 제네릭에서는 인터페이스의 상속도 extends를 사용한다!!! ***
    // 매개변수 t는 반드시 MyInterface의 구현체여야 함
    public <T extends MyInterface> void method1(T t) {
        t.print(); // 구현체 t는 print()를 오버라이드
    }
}

public class GenericBound_2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.method1(5.8); // a.<Double>method1(5.8)과 동일

        B2 b = new B2();
        b.method1(new MyInterface() { // 익명이너클래스
            @Override
            public void print() {
                System.out.println("오버라이드 구현");
            }
        });
    }
}
