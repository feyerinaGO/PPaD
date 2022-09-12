package main.ru.hw1.shapes;

public class Rectangle extends Shape {

    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        if (a<0 || b<0) {
            throw new IllegalArgumentException("Negative arguments are not allowed");
        }
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
