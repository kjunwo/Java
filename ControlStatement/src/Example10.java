public class Example10 {
    public static void main(String[] args) {
        // 시작과 끝을 나타내는 정수를 매개변수로 받아서
        // 그 두개의 정수사이에 있는 숫자들을 모두 더하는 메서드
        // 시작과 끝을 나타내는 정수 모두 덧셈에 포함하세요.
        System.out.println(sumNumbers(1, 2)); // 3
        System.out.println(sumNumbers(1, 10)); // 55
        System.out.println(sumNumbers(12, 235)); // 27664
    }

    public static int sumNumbers(int a, int b) {
        int sum = 0;
        for(int i=a; i<=b; i++){
            sum = sum + i;
        }
        return sum;
    }
}