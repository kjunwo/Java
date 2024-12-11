package Super1;

class A {
    void abc() {
        System.out.println("A클래스");
    }
}
class B extends A {
    @Override
    void abc() {
        System.out.println("B클래스 abc");
    }
    void bcd() {
        // System.out.println("B클래스 bcd");
        // abc(); // this.abc() 와 동일함
        super.abc(); // super는 부모의 인스턴스를 의미함
    }
}
public class Super_1 {
    public static void main(String[] args) {
        B value1 = new B();
        value1.abc(); // B클래스 abc
        value1.bcd(); // B클래스 bcd
        A value2 = (A)value1; // 업캐스팅
        value2.abc(); // B클래스 abc (오버라이딩)
        // value2.bcd();
        // 에러..A를 바인딩(참조)하고 있으므로 B영역에 있는 bcd 메서드는 호출이 불가능하다
    }
}
