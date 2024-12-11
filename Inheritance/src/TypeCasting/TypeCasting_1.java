package TypeCasting;

class A {
    int a = 3;
    void methodA() {
        System.out.println("A 클래스");
    }
}
class B extends A {
    int b = 4;
    void methodB() {
        System.out.println("B 클래스");
    }
}

public class TypeCasting_1 {
    public static void main(String[] args) {
        // #1. A타입
        A value1 = new A();
        System.out.println(value1.a); // 3
        value1.methodA(); // A 클래스

        // #2. B타입
        B value2 = new B();
        System.out.println(value2.a); // 3
        System.out.println(value2.b); // 4
        value2.methodA(); // A 클래스
        value2.methodB(); // B 클래스

        // #3. B->A 업캐스팅
        A value3 = new B();
        System.out.println(value3.a);
        value3.methodA();
        B value4 = (B)value3;
        System.out.println(value4.b);
        value4.methodB();
    }
}
