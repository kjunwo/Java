public class Example1 {
    public static void main(String[] args) {
        plus1(2,5);
        int result = plus2(2,5); // 리턴결과를 변수에 담아서 사용하는 경우
        System.out.println(result);
        System.out.println(plus2(2,5)); // 직접 사용하는 경우

        // 만약 덧셈결과를 다음 계상네 사용하는 경우,
        // 예) 2와 5를 더한 다음, 10을 곱하고 싶은 경우 // plus1으로는 불가능!!
        int value = plus2(2,5) * 10;
        System.out.println(value);

        // ** 결론 : 메서드의 확장성을 위해서는 return타입을 지정하는 방식이 유리!!
        plus2(4,5); // 리턴타입을 지정한 메서드라도 void형 메서드처럼 사용가능
        System.out.println(plus2(4,5));
        int x = plus2(4,5);
        System.out.println(x * 100);

    }

    public static void plus1(int a, int b) {
        System.out.println(a + b);
    }

    public static int plus2(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }
}
