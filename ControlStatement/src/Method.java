public class Method {
    public static void main(String[] args) {
        // 메서드없이 홀짝을 구분하는 코드
        int num = 4;
        String str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str); // 짝수
        num = 5;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str); // 홀수
        num = 6;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str); // 짝수
        num = 7;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str); // 홀수
        num = 8;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str); // 짝수
        num = 9;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str); // 홀수
        num = 10;
        str = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str); // 짝수

        // 메서드의 사용, 호출 (= call method)
        // 메소드의 실제 실핼 설명
        checkOddEven(4); // 매개변수로 정수 4 사용
        checkOddEven(5);
        checkOddEven(6);
        checkOddEven(7);
        checkOddEven(8);
        checkOddEven(9);
        checkOddEven(10);
        // checkOddEven(int numder = 5); // 에러!! 메게변수는 값만 입력

        System.out.println("메서드의 return");
        checkOddEven(100);
        System.out.println(checkOddEven2(100));
    }

    // 메서드의 선언, 정의
    // public static void checkOddEven(number) // 에러!! 정의는 자료형필수
    public static void checkOddEven(int numder) {
        int number = 4; // 내부적으로 동작!
        String str = (numder % 2 == 0) ? "짝수" : "홀수";
        System.out.println(str);

        // 호출
        // method1(10, 3.5, true, "Hello")
        // method1(10000, 3.145978923, false, "Hi")
        // 정의
        // public static void method1(int a, double b, boolean c, String str)


    }

        public static String checkOddEven2(int numder) {
            String str = (numder % 2 == 0) ? "짝수" : "홀수";
            return str;

    }
}
