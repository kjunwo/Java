public class ConditionalOperator {
    public static void main(String[] args) {
        // 삼항연산자
        int value1 = (3 > 5) ? 6 : 9;
        System.out.println(value1); // 9

        // if 조건문으로 변환하면,
        if (3 > 5)  {
            value1 = 6;
            System.out.println(value1);
        }else {
            value1 = 9;
            System.out.println(value1);
        }
        //System.out.println(value1);

        int value2 = (5 > 3) ? 10 : 20;
        System.out.println(value2); // 10

        int value3 = 3;
        System.out.println((value3 % 2 == 0) ? "짝수" : "홀수"); // 홀수

        // if 조건문의 형태
        if (value3 % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
