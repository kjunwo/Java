package Abstract;

abstract public class Calculator {
    abstract double calculate(double a, double b);
    void displayResult(double a, double b) {
        System.out.println("Result : " + calculate(a,b));
    }
}
class Addition extends Calculator {
    @Override
    double calculate(double a, double b) {
        return a + b;
    }
}
class Multiply extends Calculator {
    @Override
    double calculate(double a, double b) {
        return a * b;
    }
}
