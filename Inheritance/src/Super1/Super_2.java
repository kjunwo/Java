package Super1;

class AA {
    AA() {
        System.out.println("A생성자");
    }
}
class BB extends AA {
    BB() {
        // super()를 명시적으로 호출하지 않아도 컴파일러가 자동으로 호출함
        // 부모의 기본생성자는 자동으로 호출되기때문에 항상 자식클래스의 영역에는
        // 부모클래스의 영역이 생성됨
        super();
        System.out.println("B생성자");
    }
}
class CC {
    // 기본생성자가 없음

    CC(int a) {
        System.out.println("C생성자");
    }
}
class DD extends CC {
    // ****** 중요 ******
    // 이 경우, DD는 반드시 생성자를 선언해줘야 함
    // 자동으로 생성되는 기본생성자는 부모의 기본생성자를 필요로 하기 때문임
    DD() {
        // super(); // 부모에게 기본생성자가 없으므로 에러 발생
        super(3);
    }
}
public class Super_2 {
    public static void main(String[] args) {
        BB value1 = new BB();

    }
}
