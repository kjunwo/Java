package GenericMethod;

// 일반클래스안에도 제네릭 메서드 사용 가능!
class MyClass {
    // 제네릭 선언<T> 위치 주의
    public <T> T method1 (T t) {
        return t;
    }
    public <T> boolean method2(T t1, T t2) {
        return t1.equals(t2);
    }
    public <K,V> void method3 (K k, V v) {
        System.out.println(k + ":" + v);
    }
}

public class GenericMethod_1 {
    public static void main(String[] args) {
        MyClass a = new MyClass();
        String str1 = a.<String>method1("안녕");
        String str2 = a.method1("안녕"); // 주로 생략해서 사용함!!
        // <String> 생략해도 주어진 정보만으로 컴파일 오류여부를 컴파일러가 판단 가능함

        boolean bool1 = a.<Double>method2(2.5, 2.5);
        boolean bool2 = a.method2(2.5, 2.5);

        a.<String, Integer>method3("국어", 80);
        a.method3("국어", 80);
    }
}
