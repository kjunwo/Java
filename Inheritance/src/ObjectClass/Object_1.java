package ObjectClass;

class MyClass extends Object {} // extends Object는 생략해도 자동생성됨

public class Object_1 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        // 모든 클래스는 Object 클래스의 자식
        // Object가 가지고 있는 메서드를 사용할 수 있음 (오버라이딩도 가능)
        System.out.println(myClass.toString()); // ObjectClass.MyClass@2f4d3709
        System.out.println(myClass); // ObjectClass.MyClass@2f4d3709
    }
}
