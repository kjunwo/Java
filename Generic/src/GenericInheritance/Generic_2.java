package GenericInheritance;

// 제네릭메서드의 상속
class Parent2{
    public <T extends Number> void print(T t) {
        System.out.println(t);
    }
}
class Child3 extends Parent2 {}

public class Generic_2 {
    public static void main(String[] args) {
        Parent2 p = new Parent2();
        p.<Integer>print(10);
        p.print(100);
        // 자식클래스에서 부모클래스의 제네릭메서드 사용
        Child3 c = new Child3();
        c.<Double>print(5.8);
        c.print(3.14);
    }
}
