public class TypeChange3 {
    public static void main(String[] args) {
        // 같은 자료형 간의 연산
        int value1 = 3 + 5;  // 8
        int value2 = 8 / 5; // int / int =int // 1
        float value3 = 3.0f + 5.0f; // 8.0
        double value4 = 8.0 / 5.0; //1.6

        byte data1 = 3;
        byte data2 = 5;
        // byte value5 = data1 + data2;
        int value5 = data1 + data2; // 8

        // 다른 자료형 간의 연산
        // int value6 = 5 + 3.5;
        double value6 = 5 + 3.5; // 8.5
        int value7 = 5 + (int)3.5; // 8

        double value8 = 5 / 2.0; // 2.5
        byte data3 = 3;
        short data4 = 5;
        int value9 = data3 + data4; // 3 + 5 = 8
        double value10 = data3 +data4; // 3.0 + 5.0 = 8.0


    }
}
