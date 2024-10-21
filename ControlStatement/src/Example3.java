public class Example3 {
    public static void main(String[] args) {
        // 주어진 숫자가 양수인지 음수인지 확인하는 메서드
        int number = 2;
        if (number > 0) {
            System.out.println("양수");
        }else if (number < 0) {
            System.out.println("음수");
        }else {
            System.out.println("0");
        }

        // 메서드 사용
        // 아래 코드가 동작하도록 메서드를 정의하시오

        System.out.println(checkPositiveOrNegative(10)); // 양수 출력
        System.out.println(checkPositiveOrNegative(-5)); // 음수 출력
        System.out.println(checkPositiveOrNegative(0));  // 0 출력
    }
    public static String checkPositiveOrNegative(int number) {
        if (number > 0) {
            return "양수";
        }else if (number < 0) {
            return "음수";
        }else {
            return "0";
        }
    }
}
