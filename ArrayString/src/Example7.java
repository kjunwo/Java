import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        // 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        // "~~~님 환영합니다"를 출력하고
        // 없으면 "회원가입해주세요"를 출력하는 메서드 (단, 대소문자 구분하지 마시오)
        String[] members = {"Steve", "Tom", "Michael",
                "Laura", "Jessica", "Annie"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력해주세요.");
        String str = scanner.nextLine();
        System.out.println(checkMember(members, str));
    }
    public static String checkMember(String[] members, String str) {
        for (int i=0;i<members.length; i++) {
            if(members[i].equalsIgnoreCase(str)){
//            if (str.equalsIgnoreCase(members[i])) {
                return  members[i] + "님 환영합니다";
//                return str + "님 환영합니다";
            }
        }
        return "회원가입해주세요";
    }
}
