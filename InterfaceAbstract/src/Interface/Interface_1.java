package Interface;

class MyClass {} // 일반 클래스
interface A {} // 인터페이스 A
interface B {}
class C implements A {} // 단일 인터페이스 상속
class D implements A,B {} // 다중 인터페이스 상속

// 일반클래스와 인터페이스를 모두 상속받을 수 있음 (다중상속)
// 클래스상속은 오직 한개만 가능하고 인터페이스는 여러 개를 상속할 수 있음
class E extends MyClass implements A,B {}

public class Interface_1 {
    public static void main(String[] args) {

    }
}
