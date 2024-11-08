package ObjectClass;

class A {
    int a = 3;
    int b = 4;
}
class B {
    int a = 3;
    int b = 4;
    @Override // 어노테이션
    public String toString() {
        return "필드값(a,b) = " + a + " " + b;
    }
}
public class Object_2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(a); // ObjectClass.A@4e50df2e
        System.out.println(b); // 필드값(a,b) = 3 4
    }
}
