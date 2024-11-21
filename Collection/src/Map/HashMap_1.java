package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_1 {
    public static void main(String[] args) {
        Map<Integer, String> hMap1 =  new HashMap<Integer, String>();

        //#1. put (K key, V value)
        hMap1.put(2, "나다라");
        hMap1.put(1, "가나다");
        hMap1.put(3, "다라마");
        // hMap1.put(3, "가나다");
        // key는 중복허용X, value는 중복허용
        // value는 나중에 쓰는 값으로 덮어씀
        System.out.println(hMap1.toString()); //{1=가나다, 2=나다라, 3=다라마}

        //#2. putAll(다른 맵객체)
        Map<Integer, String> hMap2 = new HashMap<Integer, String>();
        hMap2.putAll(hMap1);
        System.out.println(hMap2.toString()); //{1=가나다, 2=나다라, 3=다라마}

        //#3. replace(K key, V value) 업데이트
        // 키가 존재하면 업데이트하고 없음 아무 동작하지 않음
        hMap2.replace(1, "가가가");
        hMap2.replace(4, "라라라"); //동작안함
        System.out.println(hMap2.toString()); //{1=가가가, 2=나다라, 3=다라마}

        //#4. replace(K key, V oldValue, V newValue)
        // oldValue가 정확히 일치하는 경우에만 업데이트 진행
        hMap2.replace(1, "가가가", "나나나");
        hMap2.replace(2, "다다다", "라라라"); //동작안함
        System.out.println(hMap2.toString()); //{1=나나나, 2=나다라, 3=다라마}

        //#5. V get(Object key)
        // HashMap은 순서가 없으므로 인덱스로 찾을 수 없음
        // *** <중요> 대신 key를 이용해서 해당 value를 읽는다!!! ***
        // 아래 숫자는 인덱스 아니고 key
        System.out.println(hMap2.get(1)); //나나나
        System.out.println(hMap2.get(2)); //나다라
        System.out.println(hMap2.get(3)); //다라마

        //#6. containsKey(Object key)
        System.out.println(hMap2.containsKey(1)); //true
        System.out.println(hMap2.containsKey(5)); //false

        //#7. containsValue(Object value)
        System.out.println(hMap2.containsValue("나나나")); //true
        System.out.println(hMap2.containsValue("다다다")); //false

        //#8. Set<K> keySet()
        // keySet은 key의 정보만 모아서 Set에 담아 리턴
        Set<Integer> keySet = hMap2.keySet();
        System.out.println(keySet.toString()); //[1, 2, 3]

        //#9. Set<Map.Entry<K,V>> entrySet()
        // Map.Entry는 Map의 이너인터페이스
        // entrySet()는 key와 value를 쌍으로 묶어서 Set에 담아 리턴
        // 반복문에 주로 사용됨!!!
        Set<Map.Entry<Integer,String>> entrySet = hMap2.entrySet();
        System.out.println(entrySet.toString()); //[1=나나나, 2=나다라, 3=다라마]

        //#10. size();
        System.out.println(hMap2.size()); //3

        //#11. remove(Object key)
        hMap2.remove(1);
        hMap2.remove(4); //동작안함
        System.out.println(hMap2.toString()); //{2=나다라, 3=다라마}

        //#12. remove(Object key, Object value)
        hMap2.remove(2, "나다라");
        hMap2.remove(3, "다다다"); //동작안함
        System.out.println(hMap2.toString()); //{3=다라마}

        //#13. clear()
        hMap2.clear();
        System.out.println(hMap2.toString()); //{}

        // HashMap에서 반복문을 사용하는 패턴
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cherry");
        // 패턴1) keySet()을 이용하는 방법
        for (Integer k : map.keySet()) { // For-Each 반복문이라고 부르기도함
            String value = map.get(k);
            System.out.println(k + " = " + value);
        }
        // 패턴2) entrySet()을 이용하는 방법
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        // 패턴3) Iterator를 이용하는 방법
        Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
