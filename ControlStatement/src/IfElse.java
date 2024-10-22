import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int a = 10;
        if (a > 5) {
            System.out.println(a);
        }else{
            System.out.println("조건은 거짓");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력해 주세요: ");
        int userAge = scanner.nextInt();

        if (userAge > 20 && userAge <= 30) {
            System.out.println("20대");
        }else if (userAge > 30 && userAge <= 40) {
            System.out.println("30대");
        }else if (userAge >40 && userAge <= 50) {
            System.out.println("40대");
        }else {
            System.out.println("나머지");
        }
        scanner.nextLine(); //Scanner가 가지고 있는 "엔터" 버퍼를 비워줘야 함.
        //
        System.out.println("이름을 입력해주세요: ");
        String userName = scanner.nextLine();
        System.out.println(userName);
        System.out.println("끝");
    }
}
