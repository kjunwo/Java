package Set;

// HashSet 특징
// 중복불가
// 순서없음

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_1 {
    public static void main(String[] args) {
        Set<String> hset1 = new HashSet<>();
        // #1. add
        hset1.add("A");
        hset1.add("B");
        hset1.add("C");
        hset1.add("A"); // 중복저장 안함!!!
        System.out.println(hset1); // [A, B, C] 출력순서가 고정X, 랜덤O
        // #2. addAll
        Set<String> hset2 = new HashSet<>();
        hset2.add("C");
        hset2.add("D");
        hset2.addAll(hset1);
        System.out.println(hset2); // [A, B, C, D] 랜덤출력, 중복저장X
        // #3. remove
        hset2.remove("B");
        System.out.println(hset2); // [A, C, D] 랜덤출력
        // #4. clear
        hset2.clear();
        System.out.println(hset2); // []
        // #5. isEmpty
        System.out.println(hset2.isEmpty()); // true
        // #6. contains
        Set<String> hset3 = new HashSet<>();
        hset3.add("A");
        hset3.add("B");
        hset3.add("C");
        System.out.println(hset3.contains("B")); // true
        System.out.println(hset3.contains("D")); // false
        // #7.size
        System.out.println(hset3.size()); // 3
        // #8. iterator
        Iterator<String> iterator = hset3.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // #9. toArray
        Object[] objects = hset3.toArray();
        System.out.println(Arrays.toString(objects)); // [A, B, C]
        // #10.
        String[] strings = hset3.toArray(new String[0]);
        System.out.println(Arrays.toString(strings)); // [A, B, C]
    }
}
