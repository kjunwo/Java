package Modifier;

class A1 {
    int a = 3;
    final int b = 5; // final을 필드에 적용 가능. 선언과 함께 즉시 초기화
    A1() {}
}
class A2 {
    int a;
    final int b; // 선언 따로 초기화 따로 가능
    A2() { a=3; b=5; } // final은 초기화하지 않으면 에러!!
}
class A3 {
    int a = 3;
    final int b = 5;
    A3() { a=5; } // b=9;} // final은 생성자에서도 값을 변경할 수 없음
}
class B {
    void bcd() {
        int a =3;
        final int b = 5; // final은 지역변수에 사용 가능
        a = 7;
    }
}

public class Final_1 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        A2 a2 = new A2();
        A3 a3 = new A3();
        a1.a = 10;
        // a1.b = 10; // final필드는 변경 불가능
        a2.a = 100;
        // a2.b = 100; // final필드는 변경 불가능
        System.out.println(a1.a); // 10
        System.out.println(a1.b); // 5
        System.out.println(a2.a); // 100
        System.out.println(a2.b); // 5
    }
}
