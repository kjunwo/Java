package Overriding;

class S1 {
    static int m = 3; // 정적필드
}
class S2 extends S1 {
    static int m = 4; // 정적필드
}
// 정적필드(static field)의 오버라이딩 여부 확인
public class StaticField {
    public static void main(String[] args) {
        // 정적필드는 인스턴스를 만들지 않고 참조가능
        System.out.println(S1.m); // 3
        System.out.println(S2.m); // 4

        // 객체를 생성하여 참조할수도 있음 (권장X)
        S1 value1 = new S1();
        S2 value2 = new S2();
        S1 value3 = new S2(); // 업캐스팅
        System.out.println(value1.m); // 3
        System.out.println(value2.m); // 4
        System.out.println(value3.m); // 3
        // 정적필드는 오버라이딩할 수 없음
        // 애초에 메모리의 생성위치가 독립적으로 만들어지므로 각자 존재
        // 데이터타입에 따라 참조되는 값이 달라짐
    }
}
