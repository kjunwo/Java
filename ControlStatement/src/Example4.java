public class Example4 {
    public static void main(String[] args) {
        // 숫자를 제곱하는 메서드

        // 메서드 사용
        // 아래 코드가 동작하도록 메서드를 정의하시오
        int square = 4;

        System.out.println(square(4)); // 16 출력
        System.out.println(square(9)); // 81 출력
        System.out.println(square(15)); // 225 출력
    }

    public static int square(int x) {
        return x * x;
    }
}
