package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// List 구현클래스의 생성 예제
public class List_2 {
    public static void main(String[] args) {
        // #1. 구현클래스를 이용하는 방법
        List<Integer> aList1 = new ArrayList<>();
        List<Integer> aList2 = new ArrayList<>(30);
        // ArrayList 내부적으로 메모리용량을 미리 예약해두는 개념이며
        // 실제 size는 아님!!
        System.out.println(aList2.size()); // 0

        // #2. 배열을 List로 전환하는 방법
        Integer[] array = {1,2,3,4}; // 정수의 배열
        // Arrays 클래스의 asList 메서드를 사용하여 배열을 List로 바꿀 수 있음
        List<Integer> aList3 = Arrays.asList(array);
        System.out.println(aList3); // [1, 2, 3, 4]
        // List 추가, 삭제
//        aList3.add(5); // 오류
//        aList3.remove(Integer.valueOf(1)); // 오류
        // 배열을 리스트로 전환하면 리스트를 새로 만드는게 아니라
        // 기존 배열을 이용하도록 동작함
        // 그러므로 배열과 마찬가지로 List의 사이즈를 늘리거나 줄이는 동작은 못함!!

        // 수정은 가능!!
        aList3.set(0,100);
        System.out.println(aList3); // [100, 2, 3, 4]
    }
}
