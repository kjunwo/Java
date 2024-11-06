package Overriding;

class A1 {
    protected void abc() {}
}
class B1 extends A1 {
    @Override
    public void abc() {}
}
class B2 extends A1 {
    @Override
    protected void abc() {}
}
class B3 extends A1 {
    // void abc() {} // default 접근지정자는 범위가 더 좁아지므로 안됨
}
class B4 extends A1 {
    // private void abc() {} // private 접근지정자는 범위가 더 좁아지므로 안됨
}

// 메서드 오버라이딩과 접근지정자
// 자식클래스가 오버라이딩을 정의할때 반드시 부모의 메서드의 범위와
// 같거나 더 넓어야 한다!!
public class Overriding_4 {
    public static void main(String[] args) {

    }
}
