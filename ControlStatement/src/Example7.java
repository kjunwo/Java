public class Example7 {
    public static void main(String[] args) {
        // 두 숫자 중 큰 값을 반환하는 메서드
        int num1 = 4;
        int num2 = 3;
        if (num1 > num2) {
            System.out.println("큰 수는 " + num1);
        } else if (num2 > num1){
            System.out.println("큰 수는 " + num2);
        } else {
            System.out.println("두 수는 같음");
        }

        // 메서드 사용
        // 아래 코드가 동작하도록 메서드를 정의하시오
          System.out.println(getMax(5, 10)); // 큰 수는 10
          System.out.println(getMax(23, 22)); // 큰 수는 23
          System.out.println(getMax(50, 50)); // 두 수는 같음"
    }
        public static String getMax(int num1, int num2){
            if (num1 > num2) {
                return ("큰 수는 " + num1);
            } else if (num2 > num1){
               return ("큰 수는 " + num2);
            } else {
                return ("두 수는 같음");
            }
        }
}
