import java.util.Arrays;

/*
학생의 정보와 성적을 관리하는 Student 클래스를 설계하세요.
요구사항:
 학번 (studentId) - 문자열
 이름 (name) - 문자열
 학년 (grade) - 정수

다음 메소드들을 구현하세요:
생성자(기본생성자, 모든 필드를 매개변수로 가지는 생성자)
각 필드의 getter/setter 메소드
*/
class Student {
    private String studentId;
    private String name;
    private int grade;
    private double[] scores; // 점수의 배열 {국어, 영어, 수학}

    public Student() {
        this.scores = new double[3]; // 국,영,수 3개의 데이터를 가지는 배열을 생성(=인스턴스화)
    }
    public Student(String studentId, String name, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.scores = new double[3];
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public double calAverage() {
        double sum = 0;
        for(int i=0; i<this.scores.length; i++) {
            sum = sum + this.scores[i];
        }
        return sum / this.scores.length;
    }
}

public class Example1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId("240101");
        s1.setName("Steve");
        s1.setGrade(1);
        double[] scotes1 = {80, 90, 100};
        s1.setScores(scotes1);
        System.out.println(s1.getStudentId()); // 240101
        System.out.println(s1.getName()); // Steve
        System.out.println(s1.getGrade()); // 1
        System.out.println(Arrays.toString(s1.getScores()));
        // 평균
        System.out.println(s1.calAverage()); //

        Student s2 = new Student("230211", "Tom", 2);
        System.out.println(s2.getStudentId()); // 230211
        System.out.println(s2.getName()); // Tom
        System.out.println(s2.getGrade()); // 2
        double[] scores2 = {70, 85, 60};
        s2.setScores(scores2);
        System.out.println(Arrays.toString(s2.getScores()));
        // 평균
        System.out.println(s2.calAverage()); //
    }
}

