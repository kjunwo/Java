package GenericBound;

class A3{}
class B3 extends A3 {}
class C3 extends B3 {}
class D3 extends C3 {}

class Goods<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}
class Test {
    void method1(Goods<A3> g) {}
    void method2(Goods<?> g) {} // ? 와잍드카드 : 제네릭 꺽쇠 안에 있는걸 사용
    void method3(Goods<? extends B3> g) {}
    void method4(Goods<?super B3> g) {}
}

public class GenericBound_3 {
    public static void main(String[] args) {
        Test t =new Test();
        // #1. method1
        t.method1(new Goods<A3>()); // Goods(A3)타입만 가능
        // t.method1(new Goods<B3>()); // 오류
        // t.method1(new Goods<C3>()); // 오류
        // t.method1(new Goods<D3>()); // 오류

        // #2. method2
        // 와일드카드 ?는 어떤 타입이던 그 자리에 올 수 있더는 뜻이므로
        // 모든 객체타입을 쓸 수 있음
        t.method2(new Goods<A3>());
        t.method2(new Goods<B3>());
        t.method2(new Goods<C3>());
        t.method2(new Goods<D3>());

        // #3. method3
        // 상한제한 extends
        // B3와 B3의 자식클래스만 사용 가능
        // t.method3(new Goods<A3>()); // 오류
        t.method3(new Goods<B3>());
        t.method3(new Goods<C3>());
        t.method3(new Goods<D3>());

        // #4. method4
        // 하한제한 super
        // B3와 B3의 부모클래스만 사용 가능
        t.method4(new Goods<A3>());
        t.method4(new Goods<B3>());
        // t.method4(new Goods<C3>()); // 오류
        // t.method4(new Goods<D3>()); // 오류

    }
}
// <제네릭문법>
// 와일드카드(= ?)
// : 제네릭 타입을 매개변수나 리턴 타입으로 사용할 때 구체적인 타입 대신 사용할 수 있는 특수한 타입 인자
//
// 와일드카드 사용법
// 1. 제한없는 와일드카드
// public static void printList(List<?> list) {
//    for (Object item : list) {
//        System.out.println(item);
//    }
// }
// 2. 상한 제한 와일드카드
// public static double sum(List<? extends Number> list) {
//    double sum = 0.0;
//    for (Number num : list) {
//        sum += num.doubleValue();
//    }
//    return sum;
// }
// 3. 하한 제한 와일드카드
// public static void addNumbers(List<? super Integer> list) {
//    for (int i = 1; i <= 10; i++) {
//        list.add(i);
//    }
// }
//
// 와일드카드 주의사항
// 1. 단독으로 사용할 수 없고, < >안에만 사용해야함
// 2. 제네릭 클래스 정의에서 사용할 수 없음
// class Goods<?> {  // 오류
//    private ? item;  // 오류
// }
// 3. 제네릭 불변성
// : 제네릭 타입간에는 기본적으로 상속관계가 적용되지 않음
// List<Object> objectList = new ArrayList<String>();  // 불가능
// List<Number> numberList = new ArrayList<Integer>(); // 불가능
// extends를 사용한 상한 제한
// List<? extends Number> numbers = new ArrayList<Integer>(); // OK
// List<? extends Number> numbers2 = new ArrayList<Double>(); // OK
// super를 사용한 하한 제한
// List<? super Integer> integers = new ArrayList<Number>(); // OK
// List<? super Integer> integers2 = new ArrayList<Object>(); // OK
