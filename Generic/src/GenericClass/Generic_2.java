package GenericClass;

class Goods{ // Object는 느슨한 타입이다
    private Object object =new Object();
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
}

// 모든 클래스의 부모인 Object를 이용하면 문제를 해결할 수 있음
public class Generic_2 {
    public static void main(String[] args) {
        Goods goods1 = new Goods();
        goods1.setObject(new Apple());
        // getObject()는 Object를 리턴하므로 Apple로 다운캐스팅 필요
        Apple apple = (Apple) goods1.getObject();

        Goods goods2 = new Goods();
        goods2.setObject(new Pencil());
        Pencil pencil = (Pencil) goods2.getObject(); // Pencil로 다운캐스팅

        // 실수로 Apple이 담겨있는 goods1 객체에서 Pencil을 꺼냄
        // 하지만 컴파일 에러가 발생하지않음. 이유는???
        // Object는 모든 클래스의 부모클래스로서 모든 타입의 객체 저장 가능
        // 자바의 특성상 Object는 약한 타입체크 방식으로 동작됨
        // (다른 참조형 타입들은 엄격한(=강한) 타입체크가 사용)
        // 그러므로 컴파일시점에는 타입이 맞는지 여부를 확인할 수 없으며
        // 런타임시에 실제 타입 기반으로 확인하게 됨
        Pencil pencil12 = (Pencil)goods1.getObject(); // 런타임 에러 발생

        // Object를 사용하는 방법은 하나의 클래스를 사용 가능하게 하고
        // 이전의 문제(Generic_1.java)는 해결 가능하나,
        // 타입변환 오류를 즉시 알 수 없는 단점이 있음!!
    }
}
