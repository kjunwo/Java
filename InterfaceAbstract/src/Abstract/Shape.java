package Abstract;
// 도형 클래스
abstract public class Shape {
    abstract double area(); // 도형의 면적을 구하는 추상메서드
}
class Circle extends Shape {
    // 추상클래스의 자식클래스는 추상메서드를 오버라이드를해야한다는 (강제성)
    // 단, 자식클래스만의 필드, 메서드등은 자유롭게 정의할 수 있음!!!
    // 추가로 자식클래스만의 추상메서드를 정의하는 것도 가능함
    double redius;

    Circle(double redius) {
        this.redius = redius;
    }

    @Override
    double area() {
        return Math.PI * redius * redius;
    }
}

// 직사각형
class Rectangle extends Shape {
    double x; // 가로길이
    double y; // 세로길이

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double area() {
        return x * y;
    }
}
// 정사각형 - Rectangle 상속
class Square extends Rectangle {
    public Square(double x) {
        super(x, x);
    }

    @Override
    double area() {
        return x * x;
    }
}