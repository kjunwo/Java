public class BitwiseOperator {
    public static void main(String[] args) {
        //자바 메서드로 진법 변환
        //비트연산자
        int data = 13;
        System.out.println(Integer.toBinaryString(data)); // 1101
        System.out.println(Integer.toOctalString(data)); // 15
        System.out.println(Integer.toHexString(data)); // d
        System.out.println();

        System.out.println(Integer.parseInt("1101", 2)); // 13
        System.out.println(Integer.parseInt("15", 8)); // 13
        System.out.println(Integer.parseInt("0D", 16)); //13

        //다양한 진법 표현
        System.out.println(13); // 13
        System.out.println(0b1101); // 13
        System.out.println(015); // 13
        System.out.println(0x0D); // 13
        System.out.println();

        // AND(&)비트연산자
        System.out.println(3 & 10); // 2
        System.out.println( 12 & 9); // 8
        System.out.println(0b00111 & 0b1010); // X
        System.out.println(0x03 & 0x0A); // X
        System.out.println();

        // OR(|)비트연산자
        System.out.println(3 | 10); // 11
        System.out.println(0b00111 | 0b1010);
        System.out.println(0x03 | 0x0A);
        System.out.println();

        // XOR(^)비트연산자
        System.out.println(3 ^ 10); // 9
        System.out.println(0b00111 ^ 0b1010);
        System.out.println(0x03 ^ 0x0A);
        System.out.println();

        // NOT(!)비트연산자
        System.out.println(~3); // -4

    }
}
