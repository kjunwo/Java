public class Method2 {
    public static void main(String[] args) {
        // (문제) 홀수인지 짝수인지 판단하는 메서드
        System.out.println(isOdd(33));
    }

    public static boolean isOdd(int number) {
        if (number % 2 == 1) { // 홀수의 경우
            return true;
        } else { // 짝수의 경우, else는 if옆의 조건이 false인 경우 실행됨
            return false;
        }
    }
}
