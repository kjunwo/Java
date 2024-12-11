import java.util.Arrays;

public class String3 {
    public static void main(String[] args) {
        // #5. 문자열 수정
        // 대소문자 변경
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); // java study
        System.out.println(str1.toUpperCase()); // JAVA STUDY

        // replace 문자열 교체
        System.out.println(str1.replace("Study", "공부")); // Java 공부

        // substring 문자열 수정
        System.out.println(str1.substring(0,5)); // Java
        String text = "2024-10-28";
        String year = text.substring(0,4); // 2024
        String month = text.substring(5,7); // 10
        String day = text.substring(8); // 28
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        String filename = "document.pdf";
        String extension = filename.substring(filename.lastIndexOf(".") + 1);
        System.out.println(extension); // pdf

        //split 나눈다
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray)); // [abc, def, ghi, jkl]
        // 정규표현식 (regex = regular expression)
        // 특정패턴을 가진 문자열을 찾거나 조작하기 위한 문자열.
        // 주로 문자열 검색, 추출, 치환과 같은 작업에 사용됨.
        // 정규표현식을 통해 특정 패턴을 효율적으로 찾고 원하는 부분을 추출 변경 가능함.

        // trim 공백 제거 (단어의 앞뒤에 있는 공백)
        System.out.println("    abc    ".trim()); // abc

        // #6. 문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");
        System.out.println(str2 == str3); // false
        System.out.println(str3 == str4); // false
        System.out.println(str2.equals(str3)); // true
        System.out.println(str3.equals(str4)); // false
        System.out.println(str3.equalsIgnoreCase(str4)); // true
    }
}
