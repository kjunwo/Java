public class TypeChange2 {
    public static void main(String[] args) {
        // 업캐스팅
        float value1 = 3;
        long value2 = 5;
        double value3 = 7;
        // 다운캐스팅
        byte value4 = 9;
        short value = 11;

        // 다운캐스팅인데 에러가 발생!! 명시적인 캐스팅이 필요!!
        byte value6 = (byte)128;
        System.out.println(value6);
        int value7 = (int)3.5;
        float value8 = (float)7.5;

    }
}
