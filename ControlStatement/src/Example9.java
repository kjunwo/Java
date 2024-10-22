import java.util.Scanner;

public class Example9{
    public static void main(String[] args) {
        // 입력받은 숫자의 제곱을 리턴하는 메서드
        System.out.println(square());
    }
    public static int square(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요.");
        int square = scanner.nextInt();
        return square * square;
    }
}

