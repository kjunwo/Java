import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        // 값 복사
        // 기본자료형의 값 복사
        int a = 4;
        int b = a;
        System.out.println(b);
        b = 10;
        System.out.println(a);
        System.out.println(b);
        // 참조자료형의 값 복사
        int[] ints = {1,2,3};
        int[] temps = ints;
        temps[0] = 100;
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(temps));
    }
}
