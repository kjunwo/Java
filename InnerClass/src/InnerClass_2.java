class A2 {
    int a = 3;
    int b = 4;
    void abc() {
        System.out.println("A클래스 메서드");
    }
    class B2 {
        int a = 5;
        int b = 6;
        void abc() {
            System.out.println("B클래스 메서드");
        }
        void bcd() {
            // 이너클래스 본인의 멤버를 참조 사용한다
            System.out.println(a);
            abc();
            // 아우터클래스의 멤버는 어떻게 접근하나??
            // this는 B2를 가르킴. A2.this가 아우터클래스를 참조할 수 있는 방법
            System.out.println(A2.this.a);
            A2.this.abc();
        }
    }
}

public class InnerClass_2 {
    public static void main(String[] args) {
        A2 a = new A2();
        A2.B2 b = a.new B2();
        b.bcd();
    }
}
