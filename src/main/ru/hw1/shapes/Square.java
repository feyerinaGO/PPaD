package main.ru.hw1.shapes;

public class Square extends Shape {

    private final double a;

    public Square(double a) {
        if (a<0) {
            throw new IllegalArgumentException("Negative argument is not allowed");
        }
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double getArea() {
        return a*a;
    }
}
