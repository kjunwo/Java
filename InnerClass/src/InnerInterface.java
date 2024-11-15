class C1 {
    // 이너인터페이스 : 클래스안에 선언된 인터페이스.
    // 접근 방법 : C1.D
    interface D {
        public abstract void method1();
    }
}
class C2 implements C1.D {
    @Override
    public void method1() {
        System.out.println("이너인터페이스의 구현 클래스");
    }
}

public class InnerInterface {
    public static void main(String[] args) {
        // 이너인터페이스의 객체 생성 #1. 구현클래스 이용
        C1.D value1 = new C2();
        value1.method1();
        // 이너인터페이스의 객체 생성 #2. 익명이너클래스
        C1.D value2 = new C1.D() {
            @Override
            public void method1() {
                System.out.println("익명이너클래스로 객체 생성");
            }
        };
        value2.method1();
    }
}
