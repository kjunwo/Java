import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        // 사용자로부터 입력받은 문자열을 거꾸로 출력하는 메서드
        // 예) hello 를 입력하면 olleh 를 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요.");
        String str = scanner.nextLine();
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str) {
        char[] chArray = str.toCharArray();
        char[] newArray = new char[chArray.length];
        int j = chArray.length - 1;
        for (int i=0; i< chArray.length; i++){
            newArray[j] = chArray[i];
            j = j - 1;
        }
        return String.valueOf(newArray);
    }
}
