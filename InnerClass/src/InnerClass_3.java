class A3 {
    int a = 3;
    static int b = 4;
    void method1() {
        System.out.println("인스턴스 메서드");
    }
    static void method2() {
        System.out.println("정적 메서드");
    }
    // 정적이너클래스
    static class B3 {
        void bcd() {
            // 인스턴스 필드 a와 인스턴스 메섣드 method1()은
            // A3클래스가 메모리에 생성되어야 만들어지는 멤버이므로
            // A3클래스의 인스턴스없이 참조가 불가능함
            // System.out.println(a);
            // 젇적메서드는 오직 정적 필드와 메서드만 참조할 수 있음!!!
            System.out.println(b);
            // method1();
            method2();
        }
    }
}

public class InnerClass_3 {
    public static void main(String[] args) {
        // A3 a = new A3();
        // A3.B3 b = a.new B3();
        // B3 이너클래스를 static으로 선언한 의미는 A3의 다른 정적멤버들과
        // 마찬가지로 A3의 인스턴스 없이 사용이 가능하다는 뜻
        // A3클래스의 인스턴스를 만들 필요없이 B3의 인스턴스를 생성할 수 있음!!
        A3.B3 b = new A3.B3();
        b.bcd();
    }
}
