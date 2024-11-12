package Abstract;

// 내부에 추상메서드가 한개라도 포함된 클래스에는
// 반드시 abstract 키워드를 클래스에 정의해야 한다!!
abstract class Animal {
    // 추상메서드는 본체가 없음(=중괄호{} 사용불가).
    // 미완성이라는 의미로 중괄호없이 바로 세미콜론 사용
    // 미완성이므로 cry 메서드를 반드시 오버라이드 하라는 뜻!
    abstract void cry();
}
class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class Abstract_2 {
    public static void main(String[] args) {
        // <중요> 추상클래스는 인스턴스화할 수 없음!
        // Animal animal = new Animal();
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.cry();
        animal2.cry();
    }
}
