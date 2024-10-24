public class ForLoopPattern {
    public static void main(String[] args) {
        // 1. sum : 반복문에서 합계를 저장하는 역할 변수
        int sum = 0;
        // i의 변화값을 모두 더하는 코드
        for (int i=0; i<5; i++) {
            System.out.println("i = " + i);
            sum = sum + i; // a++ = a+1
            System.out.println("sum = " + sum);
        }
        // 2. count : 반복문에서 특정 조건에 부합하는 경우를 세는 역할 변수
        int count = 0;
        // 반복중에 짝수의 갯수를 세는 코드
        for (int i=0; i<10; i++) {
            System.out.println("i = " + i);
            if (i % 2 == 0){ // 숫자0은 짝수
                count = count + 1;
                System.out.println("count = " + count);
            }
        }
    }
}
