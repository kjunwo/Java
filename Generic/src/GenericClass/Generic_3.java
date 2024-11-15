package GenericClass;
// 제네릭 문법의 등장
// <T>는 표시는 MyClass안에 T라는 제네릭타입이 사용되었음을 알리는 표시
// 보통 필드나 메서드의 매개변수에 T타입을 명시해서 사용함
// 반드시 T여야하는것은 아니고 어떤 문자던 상관없음(대신 클래스내 동일문자가 사용되야함)
// 일반적으로 사용되는 문자
// T(Type), E(Element), K(Key), V(value), N(Number) 등등
class MyClass<T> { // T 타입의 약자, 키워드 X, 갯수제한이 없다 하지만 대부분 3개정도만 사용한다
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}

public class Generic_3 {
    public static void main(String[] args) {
        // 제네릭타입 T는 객체생성시점에 결정되어야 함
        MyClass<String> mc1 = new MyClass<>();
        mc1.setT("Hello"); // 문자열저장
        MyClass<Integer> mc2 = new MyClass<>();
        mc2.setT(100); // 정수저장
        // mc2.setT("Hello"); // 컴파일에러 발생
        // 제네릭타입은 강한 타입체크를 수행하므로 타입을 잘못 사용하면 즉시 에러!!
    }
}
