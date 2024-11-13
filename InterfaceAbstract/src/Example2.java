// 게임 캐릭터 (추상클래스)
abstract class Character {
    String name;
    int hp; // 생명
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public final void takeDamage(int amount) {
        hp = hp - amount; // 공격을 받으면 받은 공격량만큼을 생명에서 뺀다
        System.out.println(name + "은 " + amount + "만큼의 공격을 받음 " + "남은 생명은 " + hp);
    }
    public abstract void doAction(); // 추상메서드
}
// 기능 인터페이스 : 근접공격
interface MeleeAttacker {
    void meleeAttack(Character target, int amount); // 추상메서드
}
// 기능 인터페이스 : 마법공격
interface MagicCaster {
    void castSpell(Character target, int amount); // 추상메서드
}
// 전사
class Warrior extends Character implements MeleeAttacker {
    public Warrior(String name, int hp) {
        super(name, hp);
    }
    @Override
    public void doAction() {
        System.out.println("전사는 근접 공격");
    }
    @Override
    public void meleeAttack(Character target, int amount) {
        System.out.println(name + "가 " + target.name + "를 공격");
        target.takeDamage(amount);
    }
}
// 마법사
class Mage extends Character implements MagicCaster {
    public Mage(String name, int hp) {
        super(name, hp);
    }
    @Override
    public void doAction() {
        System.out.println("마법사는 마법 공격");
    }
    @Override
    public void castSpell(Character target, int amount) {
        System.out.println(name + "가 " + target.name + "를 공격");
        target.takeDamage(amount);
    }
}

public class Example2 {
    public static void main(String[] args) {
        Character a = new Warrior("전사A", 100);
        Character b = new Mage("마법사B",80);
        a.doAction();
        ((MeleeAttacker) a).meleeAttack(b, 20);
        b.doAction();
        ((MagicCaster) b).castSpell(a, 10);
    }
}
