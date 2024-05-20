package lesson7.taskNumber1;


public class Cirkle extends Figures {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Cirkle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Cirkle";
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
