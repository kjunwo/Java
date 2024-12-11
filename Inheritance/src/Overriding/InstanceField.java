package Overriding;

class C1 {
    int m = 3;
}
class C2 extends C1 {
    int m =4;
}
// 인스턴스 필드의 오버라이딩 여부 확인
public class InstanceField {
    public static void main(String[] args) {
        C1 value1 = new C1();
        C2 value2 = new C2();
        C1 value3 = new C2(); // 업캐스팅
        System.out.println(value1.m); // 3
        System.out.println(value2.m); // 4
        System.out.println(value3.m); // 3
        // 인스턴스 필드는 오버라이딩되지 않는다!
        // 각자 따로 존재한다
    }
}
