package Queue;

import java.util.LinkedList;
import java.util.Queue;

// 큐 (Queue) 인터페이스
// 선입선출 FIFO (=First In First Out)
// 주로 키입력등의 이벤트처리에 사용됨
// 먼저 들어온 객체정보를 먼저 사용함
// 구현체로는 LinkedList 또는 PriorityQueue를 많이 사용
//PriorityQueue는 들어온 순서가 아니라 그 일의 우선순위에 따라 처리하는 방식
//LinkesList의 노드연결방식이 큐의 특징인 잦은 삽입과 삭제의 처리에 적합하기 때문!!
public class Queue_1 {
    public static void main(String[] args) {
        // 예외처리없는 메서드 (안전장치가 없으므로 조심해서 사용)
        Queue<Integer> q1 = new LinkedList<>();
        // #1. add 추가 (큐의 사이즈가 다 차서 더이상 추가할 수 없으면 에러발생)
        q1.add(3);
        q1.add(4);
        q1.add(5);
        // #2. element 읽기 (삭제 X)
        System.out.println(q1.element()); // 3
        // #3. remove 삭제 (꺼내면서 삭제)
        System.out.println(q1.remove()); // 3
        System.out.println(q1.remove()); // 4
        System.out.println(q1.remove()); // 5
        // System.out.println(q1.remove()); // 오류 (큐가 비었음)

        // 예외처리있는 메서드 (안전장치)
        Queue<Integer> q2 = new LinkedList<>();
        // #4. offer 추가 (큐의 크기가 다 차도 에러가 발생하지않고 추가안함)
        q2.offer(3);
        q2.offer(4);
        q2.offer(5);
        // #5. peek 읽기
        System.out.println(q2.peek()); // 3
        // #6. poll 꺼내면서 지우기
        System.out.println(q2.poll()); // 3
        System.out.println(q2.poll()); // 4
        System.out.println(q2.poll()); // 5
        System.out.println(q2.poll()); // null (에러발생안함)
    }
}
