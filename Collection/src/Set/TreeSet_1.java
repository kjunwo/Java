package Set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        // TreeSet에 정수데이터를 자동으로 추가
        for (int i=50; i>0; i-=2) {
            treeSet.add(i);
        }
        // 50,48,46... 순서로 데이터입력했지만 자동으로 정렬되어 출력됨
        System.out.println(treeSet); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]

        // #1. first 제일 앞에 있는 데이터 읽기
        System.out.println(treeSet.first()); // 2
        // #2. Last 제일 끝에 있는 데이터 읽기
        System.out.println(treeSet.last()); // 50
        // #3. Lower 매개변수보다 작은 데이터 읽기
        System.out.println(treeSet.lower(26)); // 24
        // #4. higher 매개변수보다 큰 데이터 읽기
        System.out.println(treeSet.higher(26)); // 28
        // #5. floor 매개변수보다 <=(작거나 같은) 데이터 읽기
        System.out.println(treeSet.floor(25)); // 24
        System.out.println(treeSet.floor(26)); // 26
        // #6. ceiling 매개변수보다 >=(크거나 같은) 데이터 읽기
        System.out.println(treeSet.ceiling(25)); // 25
        System.out.println(treeSet.ceiling(26)); // 26

        // #7. pollFirst 첫번째 데이터를 꺼냄
        int size = treeSet.size();
        System.out.println(size); // 25
        for ( int i=0; i<size; i++) {
            // 25번 treeSet에서 데이터를 꺼냄
            System.out.println(treeSet.pollFirst()); // 2,4,6,8......
        }
        System.out.println(treeSet.size()); // 0
        // #8. pollLast 마지막 데이터를 꺼냄
        for (int i=0; i>0; i-=2) {
            treeSet.add(i);
        }
        size = treeSet.size(); // 25
        for (int i=0;i<size; i++) {
            System.out.println(treeSet.pollLast()); // 50, 48, 46...
        }
        System.out.println(treeSet.size()); // 0

        // Set으로부터 특정조건의 Set을 얻는 메서드
        for (int i=50; i>0; i-=2) {
            treeSet.add(i);
        }
        // #9. headSet 특정조건을 기준으로 앞부분 Set을 읽음
        SortedSet<Integer> sSet = treeSet.headSet(20); // 포함 X
        System.out.println(sSet); // [2, 4, 6, 8, 10, 12, 14, 16, 18]
        // NavigableSet으로 타입변환하면 조건의 포함여부를 선택할 수 있음
        // true는 포함O, false는 포함X
        NavigableSet<Integer> nSet = treeSet.headSet(20, true);
        System.out.println(nSet); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

         // #10. tailSet 특정조건의 기준으로 뒷부분 Set을 읽음
        sSet = treeSet.tailSet(20);
        System.out.println(sSet); // [20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]
        nSet = treeSet.tailSet(20, false);
        // false이기때문에 조건을 포함하지 않음!
        System.out.println(nSet); // [22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50]

        // #11. subSet 특정조건사이의 Set을 읽음
        sSet = treeSet.subSet(10,20);
        // SortedSet의 경우, 앞은 포함O, 뒤는 포함X
        System.out.println(sSet); // [10, 12, 14, 16, 18]
        nSet = treeSet.subSet(10,false, 20, true);
        // false-true로 전달했으므로 10은 포함X, 20은 포함O
        System.out.println(nSet); // [12, 14, 16, 18, 20]
    }
}
