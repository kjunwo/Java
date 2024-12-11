package P1029;

public class Student {
    // #1. 필드
    String name;
    int age;
    String address;
    String gender;
    double scoreMath;
    double scoreHistory;
    double scoreMusic;
    // #2. 생성자 : 필드영역을 초기화하는 역할
    // 기본생성자
    public Student() {

    }
    // 매개변수를 가진 생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 생성자와 메서드의 차이점
    // 1) 목적 : 생성자는 필드의 초기화 역할. 메서드는 각종 기능 구현 역할
    // 2) 이름 : 생성자는 클래스와 동일한 이름. 메서드는 자유롭게 작명(주로 동사로 시작)
    // 3) 반환형 : 생성자는 반환형 없음. 메서드는 반드시 명시(void, int, String등)
    // 인텔리제이는 자동으로 생성자를 만들어주는 기능을 지원함
    // 우클릭 - Generate - Constructor - 원하는 필드선택 - OK
    public Student(String name, int age, String address, String gender, double scoreMath, double scoreHistory, double scoreMusic) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.scoreMath = scoreMath;
        this.scoreHistory = scoreHistory;
        this.scoreMusic = scoreMusic;
    }
    // #3. 메서드
    // sumScore : 점수의 합계를 리턴하는 메서드
    public double sumScore() {
        double sum = 0;
        sum = this.scoreHistory + this.scoreMath + this.scoreMusic;
        return sum;
    }
}