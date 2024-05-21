package lesson7.taskNumber1;


public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
