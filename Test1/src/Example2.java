public class Example2 {
    public static void main(String[] args) {
        //정수형
        byte a = 1; // 1byte
        short b = 128; // 2byte
        int c = 1000; // 4byte
        long d = 100000L; // 8byte (L을 붙혀줘도 되고 안붙혀줘도 되지만 붙이는게 좋음)

        //실수형
        float e = 3.5f; // 4byte float는 f를 써야한다
        double f = 3.144372894732; // 8byte

        // 문자형
        char g = 'A'; // 2byte
        String h = "안녕하세요"; // 가변형(값마다 다름)

        //불리언형 (참거짓)
        boolean i = false; // 1byte

        // 숫자 진법에 따른 다양한 표기법
        c = 15; // 10진법 표기
        System.out.println(c);
        c = 0b1111; // 2진법 표기
        System.out.println(c);
        c = 0xF; // 16진법 표기
        System.out.println(c);

    }
}
