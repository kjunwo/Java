package Modifier_1.pack1;

public class B {
    public void print() {
        A a = new A();
        System.out.print(a.a + " ");
        System.out.print(a.b + " ");
        System.out.print(a.c + " ");
        // System.out.print(a.d + " "); // private 다른 클래스에서 접근 불가
        System.out.println();
    }
}
