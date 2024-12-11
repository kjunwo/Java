package Overriding;

class M1 {
    static void print() {
        System.out.println("부모 클래스");
    }
}
class M2 extends M1 {
    static void print() {
        System.out.println("자식 클래스");
    }
}

// 정적메서드의 오버라이딩 여부 확인
public class StaticMethod {
    public static void main(String[] args) {
        M1 value1 = new M1();
        M2 value2 = new M2();
        M1 value3 = new M2(); // 업캐스팅
        value1.print(); // 부모클래스
        value2.print(); // 자식클래스
        value3.print(); // 부모클래스
        // 정적 메서드는 인스턴스를 이용하지 않고 클래스이름.메서드 형식으로 사용 권장
        M1.print(); // 부모클래스
        M2.print(); // 자식클래스
    }
}
