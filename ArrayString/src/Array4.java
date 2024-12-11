public class Array4 {
    public static void main(String[] args) {
        // 배열의 길이
        int[] numbers = {3, 4, 5, 6, 7};
        System.out.println("배열의 길이 : " + numbers.length);
        // 배열의 출력 (반복문사용1)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // 배열의 출력 (반복문사용2) - For문의 간단 버전
        // <주의> 오직 배열과 컬렉션에만 사용이 가능하다!!!
        // data변수는 iterator(반복자)가 아니고 배열에서 순서대로 꺼낸 데이터임.
        for (int data : numbers) {
            System.out.println(data);
            // data는 반복문안에서 순서대로 3, 4, 5, 6, 7을 가짐
        }
        System.out.println();
        // 예제
        String[] colors = {"black", "white", "blue", "red", "green"};
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        System.out.println();
        for (String data : colors) {
            System.out.println(data);
        }
        System.out.println();
        int count = 0;
        for (String data : colors) {
            System.out.println(count + " : " + data);
            count = count + 1;
        }
        // 간단버전의 For문(= for-each문)은 인덱스값을 제공하지 않기 때문에 필요하면 직접 추가해야함
    }
}