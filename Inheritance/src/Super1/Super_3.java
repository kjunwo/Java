package Super1;

class A1 {
    A1() {
        this(3); // this() 또는 super()는 반드시 첫번째 줄에 있어야 함!!!
        System.out.println("A1생성자 1");
        // this(3); // 에러!!
    }
    A1(int a) {
        System.out.println("A1생성자 2");
    }
}
class B1 extends A1 {
    B1() {
        this(3);
        System.out.println("B1생성자 1");
    }
    B1(int a) {
        System.out.println("B1생성자 2");
    }
}
public class Super_3 {
    public static void main(String[] args) {
//        A1 value1 = new A1();
//        A1 value2 = new A1(3);
//        B1 value3 = new B1();
        B1 value4 = new B1(3);
    }
}
