public class Example11 {
    public static void main(String[] args) {
        // 시작과 끝을 나타내는 정수를 매개변수로 받아서
        // 그 두개의 정수 사이에 몇개의 짝수가 있는지
        // 계산하는 메서드
        // (첫번째 매개변수) <= 숫자범위 < (두번째 매개변수)
        // 첫번째 매개변수는 두번째 매개변수보다 작음
        System.out.println(countEvenNumbers(1,10)); // 4
        System.out.println(countEvenNumbers(3,4)); // 0
        System.out.println(countEvenNumbers(1,200)); // 99
    }
    public static int countEvenNumbers(int a, int b){
        int count = 0;
        for(int i=a; i<b; i++){
           if (i % 2 == 0) {
               count = count + 1;
            }
        }
        return count;
    }

}
