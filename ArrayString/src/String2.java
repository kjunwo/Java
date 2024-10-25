public class String2 {
    public static void main(String[] args) {
        // #1. 문자열 길이 Length()
        String str1 = "Hello Java!";
        String str2 = "안녕하세요! 반갑습니다.";
        System.out.println(str1.length()); // 11
        System.out.println(str2.length()); // 13
        System.out.println();

        // #2. 문자열 검색 charAT(), indexOf(), LastIndexOf()
        System.out.println(str1.charAt(1)); // e
        System.out.println(str2.charAt(1)); // 녕
        System.out.println();
        System.out.println(str1.indexOf('a')); // 7
        System.out.println(str1.lastIndexOf('a')); // 9
        System.out.println(str1.indexOf('a', 8)); // 9
        System.out.println(str1.lastIndexOf('a', 8)); // 7
        System.out.println(str1.indexOf("Java")); // 6
        System.out.println(str1.indexOf("java")); // -1 (못찾았을 경우, 대소문자 구별)
        System.out.println(str1.lastIndexOf("Java")); // 6

        // #3. 문자열의 변환 및 연결 valueOf(), concat()
        String str3 = String.valueOf(2.3); // double -> String 변환
        String str4 = String.valueOf(false); // boolean ->String 변환
        System.out.println(str3); // "2.3"
        System.out.println(str4); // "false"

    }
}
