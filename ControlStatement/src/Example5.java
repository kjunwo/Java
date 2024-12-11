public class Example5 {
    public static void main(String[] args) {
        // 문자열을 대문자로 변환하는 메서드
        String str = "hello";
        System.out.println(str.toUpperCase());

        // 메서드 사용
        // 아래 코드가 동작하도록 메서드를 정의하시오
       System.out.println(changeToUpperCase("hello")); // "HELLO" 출력
       System.out.println(changeToUpperCase("legend")); // "LEGEND" 출력
       System.out.println(changeToUpperCase("WorLD")); // "WORLD" 출력



    }
    public static String changeToUpperCase (String str){
       return str.toUpperCase();
    }
    }



