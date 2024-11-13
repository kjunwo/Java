package Interface.Q1;

/* 문제 설명:
 * 1. ___1___ 에는 이 인터페이스가 나타내는 특성에 맞는 인터페이스 이름을 작성하세요.
 * 2. ___2___ 에는 Bird 클래스가 구현해야 하는 적절한 반환 타입을 작성하세요.
 * 3. ___3___ 에는 상위 클래스의 생성자를 호출하는 코드를 작성하세요.
 * 4. ___4___ 에는 speed 변수의 값을 반환하는 적절한 코드를 작성하세요.
 * 5. ___5___ 에는 Fish 클래스가 상속받아야 하는 클래스를 작성하세요.
 */

// 이동 가능한 것을 나타내는 인터페이스
interface Movable {
    void move();
    int getSpeed();
}

// 소리를 낼 수 있는 것을 나타내는 인터페이스
interface Soundable {
    void makeSound();
}

// 동물을 나타내는 추상클래스
abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eat();

    public void sleep() {
        System.out.println(name + "이(가) 잠을 잡니다.");
    }
}

// Bird 클래스
class Bird extends Animal implements Movable, Soundable {
    private int speed;

    public Bird(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) " + speed + "km/h로 날아갑니다.");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void makeSound() {
        System.out.println("짹짹!");
    }

    @Override
    void eat() {
        System.out.println(name + "이(가) 벌레를 먹습니다.");
    }
}

// Fish 클래스
class Fish extends Animal implements Movable {
    private int speed;

    public Fish(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) " + speed + "km/h로 헤엄칩니다.");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    void eat() {
        System.out.println(name + "이(가) 플랑크톤을 먹습니다.");
    }
}
public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Bird("참새", 1, 40);
        Fish goldfish = new Fish("금붕어", 2, 5);

        sparrow.move();
        sparrow.makeSound();
        sparrow.eat();

        goldfish.move();
        goldfish.eat();
    }
}
