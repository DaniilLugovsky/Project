package lesson7.taskNumber1;

public class Triangle extends Figures {

    private double length;
    private double height;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public String getName() {
        return "Isosceles triangle";
    }

    @Override
    public double getSquare() {
        return (height * length) / 2;
    }

    @Override
    public double getPerimeter() {
        return length * 3;
    }
}
