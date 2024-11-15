package GenericClass;
// 제네릭 타입이 3개인 경우 예제
class Triple<A,B,C> {
    private A first;
    private B second;
    private C third;
    public Triple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public A getFirst() {
        return first;
    }
    public B getSecond() {
        return second;
    }
    public C getThird() {
        return third;
    }
}
public class Generic_6 {
    public static void main(String[] args) {
        Triple<String, Integer, Double> triple = new Triple<>("apple", 3, 1.54);
        String fruit = triple.getFirst();
        Integer count = triple.getSecond();
        Double weight = triple.getThird();
        System.out.println(fruit + " " + count + " " + weight);
    }
}
