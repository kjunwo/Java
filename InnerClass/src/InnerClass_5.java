interface A {
    public abstract void abc(); // 추상메서드
}
class B implements A {
    @Override
    public void abc() {
        System.out.println("오버라이드");
    }
}
class C {
    void method(A a) {
        a.abc();
    }
}

public class InnerClass_5 {
    public static void main(String[] args) {
        C c = new C();
        // C의 method()를 호출할때 매개변수로 A의 구현체를 전달하는 4가지 방법
        // #1
        A a = new B(); // 구현클래스의 B의 생성자로 객체생성 -> A로 업캐스팅
        c.method(a);
        // #2 : 방법1의 단순버전. 변수를 따로 사용하지 않음
        c.method(new B());
        // #3 // 구현클래스의 인스턴스를 만들지않고 인터페이스A의 구현체를 만드는 방법
        // 익명이너클래스!!!
        A aa = new A() {
            @Override
            public void abc() { System.out.println("#3방법"); }
        };
        c.method(aa);
        // #4 : 방법3의 단순버전. 변수를 따로 사용하지 않음
        c.method(new A() {
            @Override
            public void abc() { System.out.println("#4방법"); }
        });
    }
}

