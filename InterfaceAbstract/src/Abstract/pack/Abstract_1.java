package Abstract.pack;

class Animal {
    void cry() {}
}
class Cat extends Animal {}
class Dog extends Animal {}

// 일반 클래스의 상속
// #1. 부모클래스인 Animal의 인스턴스화 가능
// #2. 자식클래스인 Cat, Dog이 cry메서드 오버라이드 안해도 아무 문제 없음
public class Abstract_1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
    }
}
