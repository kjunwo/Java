package Overriding;

class Animal {
    void cry() {
        System.out.println("...");
    }
}
// 자식클래스 새, 고양이, 개
class Bird extends Animal{
    @Override // 어노테이션
    void cry() {
        super.cry(); // ...
    }
    //void cry() {
    //    System.out.println("짹짹");
    }
    // 어노테이션 코드에 추가적인 정보를 제공하기 위한 메타데이터
    // 메타데이터는 주로 코드의 의미를 명확하게 하고 컴파일러에게 지시를 내리거나
    // 특정 동작을 수행할 수 있도록 명령하는 코드
    // @Override 어노테이션의 장점
    // #1. 컴파일러가 오버라이딩 여부를 검증
    // #2. 개발자의 가독성을 향상
    // #3. 메서드 수정시 실수를 방지해줌
// }
class Cat extends Animal {
    void cry() {
        System.out.println("야옹");
    }
}
class Dog extends Animal {
    void cry() {
        System.out.println("멍멍");
    }
}

public class Overriding_2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.cry();
        bird.cry();
        cat.cry();
        dog.cry();
        System.out.println();
        Animal animal1 = new Bird(); // 업캐스팅
        Animal animal2 = new Cat(); // 업캐스팅
        Animal animal3 = new Dog(); // 업캐스팅
        animal1.cry();
        animal2.cry();
        animal3.cry();
        System.out.println();

        // 배열생성
        // 부모클래스로 배열의 타입을 정의하면 자식클래스들 모두를 배열화할 수 있음
        Animal[] animals = {animal, bird, cat, dog, animal1, animal2};
        printCry(animals);
    }
    static void printCry(Animal[] animals) {
        for (Animal animal : animals) {
            animal.cry();
        }
    }
}














