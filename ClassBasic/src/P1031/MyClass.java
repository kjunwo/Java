package P1031; // 피키지 정의부분 (인텔리제이가 자동으로 부여함)

// #1. 다른 패키지에 있는 외부클래스를 사용하려면 import해야만 함
import java.util.Arrays; // 라이브러리라고도 함

// MyClass.java파일내의 유일한 public 클래스임
// 반드시 파일명과 클래스이름이 동일해야함!!
public class MyClass {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World"};
        System.out.println(Arrays.toString(strings));
        // #2. import없이 풀네임을 사용할 수도 있음
        // System.out.println(java.util.Arrays.toString(strings));
        ExternalClass ec = new ExternalClass();
        ExternalClass2 ec2 = new ExternalClass2();
    }
}

class ExternalClass {
    // 외부클래스를 같은 파일내에 정의한 경우,
    // 외부클래스는 public을 사용할 수 없음!!
}
