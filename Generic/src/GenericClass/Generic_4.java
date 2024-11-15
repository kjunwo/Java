package GenericClass;

class GoodsContainer<T> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}

public class Generic_4 {
    public static void main(String[] args) {
        // 사과
        GoodsContainer<Apple> goods1 = new GoodsContainer<>();
        goods1.setT(new Apple());
        Apple apple = goods1.getT();
        // 연필
        GoodsContainer<Pencil> goods2 = new GoodsContainer<>();
        goods2.setT(new Pencil());
        Pencil pencil = goods2.getT();
        // 잘못된 타입 선언
        GoodsContainer<Apple> goods3 = new GoodsContainer<>();
        goods3.setT(new Apple());
        // Pencil pencil2 = goods3.getT(); // 컴파일 오류 발생
        // 강한 타입 체크에 의해서 컴파일단계에 즉시 에러가 발생하므로 코드의 안정성을 높인다
    }
}
