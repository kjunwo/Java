public class LogicalOperator {
    public static void main(String[] args) {
        // 논리 연산자 (&&, ||, ^, !)
        // AND(&&)
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(true && (5 < 3)); // false
        System.out.println((5 <=5 ) && (7 > 2)); //true
        System.out.println();

        //OR(||)
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false ||(5 < 3)); //false
        System.out.println((5 <= 5) || (7 > 2)); //true
        System.out.println();

        //XOR(^) (달라야 true고 같으면 false이다)
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ (5 < 3)); // false
        System.out.println((5 <= 5) ^ (7 > 2)); // false
        System.out.println();

        //NOT(!)
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(false || !(5 < 3)); // true
        System.out.println((5 <= 5) || ! (7 > 2)); // true (쇼트서킷)

        // 쇼트서킷
        int value1 = 3;
        System.out.println(false && ++value1>6); // false
        System.out.println(value1); // 3 쇼트서킷이 발생하여 ++value1 실행안됨

        int value2 = 3;
        System.out.println(false & ++value2 > 6);
        System.out.println(value2);

        int value3 = 3;
        System.out.println(true || ++value3 > 6);
        System.out.println(value3);

        int value4 = 3;
        System.out.println(true | ++value4 > 6);
        System.out.println(value4);



    }
}
