package Vector;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

// List인터페이스의 두번째 구현클래스 Vector 사용법
// 멀티쓰레드 환경에 적합한 동기화기능을 지원한다!!
// 멀티쓰레드를 수행하는데 쓰인다면 Vector를 사용해야함
public class Vector_1 {
    public static void main(String[] args) {
        List<Integer> vector1 = new Vector<>();

        // #1. add 뒤에 추가
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        System.out.println(vector1); // [3, 4, 5]
        // #2. add 중간 삽입
        vector1.add(1,6);
        System.out.println(vector1); // [3, 6, 4, 5]
        // #3. addAll 뒤에 리스트 추가
        List<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2); // [1, 2]
        vector2.addAll(vector1);
        System.out.println(vector2); // [1, 2, 3, 6, 4, 5]
        // #4. addAll 중간에 리스트 삽입
        List<Integer> vector3 = new Vector<>();
        vector3.add(1);
        vector3.add(2); // [1, 2]
        vector3.addAll(1, vector3);
        System.out.println(vector3); // [1, 1, 2, 2]
        // #5. set 수정
        vector3.set(1,5);
        vector3.set(3,6);
        System.out.println(vector3); // [1, 5, 2, 6]
        // #6. remove(int index) 인덱스로 삭제
        vector3.remove(1);
        System.out.println(vector3); // [1, 2, 6]
        // #7. remove(Object o) 값으로 삭제
        vector3.remove(Integer.valueOf(2));
        System.out.println(vector3); // [1, 6]
        // #8 clear 전체삭제
        vector3.clear();
        System.out.println(vector3); // []
        // #9 isEmpty 리스트가 비었는지 확인 (참 또는 거짓 리턴)
        System.out.println(vector3.isEmpty()); // true
        // #10. size 리스트내 요소의 갯수
        System.out.println(vector3.size()); // 0
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);
        System.out.println(vector3.size()); // 3
        // #11. get 읽기
        for(int i=0; i<vector3.size();i++){
            System.out.println(vector3.get(i));
        }
        // #12. toArray 리스트를 배열로 타입변환
        // toArray는 오브젝트의 배열을 리턴하므로 오브젝트의 배열 타입으로 받아야함
        Object[] objects = vector3.toArray();
        System.out.println(Arrays.toString(objects)); // [1, 2, 3]
        // #13. toArray (Integer의 배열로 받으려면 별도의 명시를 해줘야함)
        Integer[] integers = vector3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers)); // [1, 2, 3]
    }
}
