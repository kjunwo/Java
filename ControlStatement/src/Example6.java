public class Example6 {
    public static void main(String[] args) {
        // 두 문자열이 같은지 비교하는 메서드
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "world";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        // 메서드 사용
        // 아래 코드가 동작하도록 메서드를 정의하시오
           System.out.println(areEqual("test", "test")); // true 출력
           System.out.println(areEqual("hello", "world")); // false 출력
    }
            public static boolean areEqual (String str1, String str2){
                return str1.equals(str2);

                }
            }
