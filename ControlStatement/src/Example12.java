public class Example12 {
    public static void main(String[] args) {
        // 매개변수로 전달한 숫자의 범위안에서
        // 특정 숫자를 발견하고 해당 숫자를 문자로 출력하는 메서드
        // 첫번째 매개변수 : 숫자범위의 시작
        // 두번째 매개변수 : 숫자범위의 끝
        // 세번째 매개변수 : 찾을 숫자
        System.out.println(findNumber(1, 10, 5)); // "5"
        System.out.println(findNumber(-10, 10, 0)); // "0"
        System.out.println(findNumber(20, 50, 55)); // "없음"
    }

    public static String findNumber(int a, int b, int c) {
        for (int i = a; i <= b; i++) {
            if (i == c) {
                return ""+c;
                // return Integer.toString(c)
            }
        }
        return "없음";

//    public static String findNumber(int a, int b, int c) {
//        boolean found = false;
//        for (int i =a; i<=b; i++) {
//            if (i==c) {
//                found = true;
//                break;
//            }
//        }
//        if(found){
//            return ""+c;
//        }else {
//            return "없음";
//        }
    }
}