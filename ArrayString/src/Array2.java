import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        // 배열의 생성과 값 대입 - 리터럴 방법
        // int [] numbers = new int[5]; // 일반 방법
        int[] numbers = {1,2,3,4,5}; // 리터럴 방법
        // String[] names = new String[5]; // 일반 방법
        String[] names = {"Steve", "Tom", "Mike", "Laura", "Sam"}; // 리터럴 방법
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));

    }
}
