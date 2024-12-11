import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // switch문 역할은 특정위치로 이동시키는 것
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("A");
                break; // 의미: 중괄호를 깬다
            case 2: // switch (a)에 따라 case 2:로 이동한 후 차례대로 구문 실행
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("요일을 입력해주세요: ");
        String day = scanner.nextLine();
        switch (day) {
            case "월":
            case "월요일":
                System.out.println("오늘은 월요일입니다.");
                break;
            case "화":
            case "화요일":
                System.out.println("오늘은 화요일입니다.");
                break;
            case "수":
            case "수요일":
                System.out.println("오늘은 수요일입니다.");
                break;
            case "목":
            case "목요일":
                System.out.println("오늘은 목요일입니다.");
                break;
            case "금":
            case "금요일":
                System.out.println("오늘은 금요일입니다.");
                break;
            case "토":
            case "토요일":
                System.out.println("오늘은 토요일입니다.");
                break;
            case "일":
            case "일요일":
                System.out.println("오늘은 일요일입니다.");
                break;
            default:
                System.out.println("올바른 요일을 입력해주세요.");
                break;
        }
        scanner.close(); // 스캐너 객체를 메모리에서 삭제시킴
    }
}
