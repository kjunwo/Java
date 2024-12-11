package GenericClass;

// 제네릭타입이 2개 이상인 경우 (갯수제한 없음)
class KeyValue<K,V> {
    private K key;
    private V value;
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
}

public class Generic_5 {
    public static void main(String[] args) {
        // <문자열, 정수>
        // 제네릭타입으로 원시자료형은 사용할 수 없음
        // 원시자료형은 해당 wrapping class를 사용해야함 (Integer, Double 등등)
        KeyValue<String, Integer> kv1 = new KeyValue<>();
        kv1.setKey("사과");
        kv1.setValue(1000);
        String key1 = kv1.getKey();
        int value1 = kv1.getValue(); // 자바가 자동으로 형변환해줌
        // <정수, 문자열>
        KeyValue<Integer,String> kv2 = new KeyValue<>();
        kv2.setKey(404); // 웹브라우저 에러코드 404
        kv2.setValue("Not Found Error"); // 에러설명
        int key2 = kv2.getKey();
        String value2 = kv2.getValue();
        // key만 저장하고 vlaue는 아무 값도 저장하고 싶지 않은 경우
        KeyValue<String, Void> kv3 = new KeyValue<>();
        kv3.setKey("키값만 사용");
        String key = kv3.getKey();
        System.out.println(key);
        // setValue()는 Void타입만 매개변수로 받을 수 있음
        // Void는 null만이 유일한 값임
        // kv3.setValue(1); // 에러 발생 Void대신 Integer를 입력했기때문
        // kv3.setValue("hello"); // 에러 Void대신 문자열을 입력했기때문
        kv3.setValue(null); // null은 저장가능
        System.out.println(kv3.getValue());
    }
}
