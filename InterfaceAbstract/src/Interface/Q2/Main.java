package Interface.Q2;

/* 문제 설명:
 * 1. ___1___ 에는 인터페이스 메소드의 적절한 반환 타입을 작성하세요. (넓이는 소수점도 처리해야 합니다)
 * 2. ___2___ 에는 Shape 클래스의 적절한 접근 제어자를 작성하세요. (하위 클래스에서만 접근 가능)
 * 3. ___3___ 에는 삼각형의 넓이를 계산하는 공식을 작성하세요. (밑변 * 높이 / 2)
 * 4. ___4___ 에는 적절한 메소드 이름을 작성하세요. (Resizable 인터페이스 구현)
 * 5. ___5___ 에는 반지름이 2배가 되도록 하는 코드를 작성하세요.
 * 6. ___6___ 에는 정사각형의 둘레를 계산하는 코드를 작성하세요.
 * 7. ___7___ 에는 도형의 색상을 반환하는 메소드를 완성하세요.
 */

// 도형의 계산 기능을 정의하는 인터페이스
interface Calculatable {
    double getArea();
    double getPerimeter();
}

// 크기 조절이 가능한 도형을 정의하는 인터페이스
interface Resizable {
    void resize(double factor);
}

// 색상 변경이 가능한 도형을 정의하는 인터페이스
interface Colorable {
    void setColor(String color);
    String getColor();
}

// 기본 도형 클래스
abstract class Shape implements Calculatable, Colorable {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}

// 삼각형 클래스
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        // 정삼각형으로 가정
        return base * 3;
    }
}

// 원 클래스
class Circle extends Shape implements Resizable {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        radius = radius * factor;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }
}

// 정사각형 클래스
class Square extends Shape implements Resizable {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void resize(double factor) {
        this.side *= factor;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        Triangle triangle = new Triangle(4.0, 3.0, "Blue");
        Square square = new Square(6.0, "Green");

        System.out.println("Circle Area: " + circle.getArea());
        circle.resize(2.0);
        System.out.println("Circle Area after resize: " + circle.getArea());

        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Color: " + triangle.getColor());

        System.out.println("Square Perimeter: " + square.getPerimeter());
        square.resize(0.5);
        System.out.println("Square Perimeter after resize: " + square.getPerimeter());
    }
}
