package main.ru.hw1.shapes;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius<0) {
            throw new IllegalArgumentException("Negative argument is not allowed");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
