package Interface;

interface D1 {
    void abc(); // 추상메서드
    public default void bcd() { // default는 접근지정자 아님!!
        System.out.println("인터페이스 D1의 디폴드 메서드");
    }
}
class D2 implements D1 {
    @Override
    public void abc() {} // 추상메서드 abc()의 오버라이드
    // <중요> 디폴트메서드 bcd()는 오버라이드 안해도 됨!!
}
class D3 implements D1 {
    @Override
    public void abc() {} // 추상메서드 abc()의 오버라이드
    @Override
    public void bcd() { // 디폴트메서드 bcd()는 오버라이드도 가능함!!
        D1.super.bcd();
    }
}
// 디폴트메서드는 기존 인터페이스를 수정 업데이트해도 기존 구현 클래스를
// 수정할 필요 없도록 기본 구현을 제공할 수 있음
// 추상메서드와 달리 구현내용을 가지고 있는 메서드임(자바8버전에서 새로 등장)
public class Interface_5 {
    public static void main(String[] args) {

    }
}
