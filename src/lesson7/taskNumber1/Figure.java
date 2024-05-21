package lesson7.taskNumber1;

public abstract class Figure {
    private double square;
    private double perimeter;
    private String name;

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setGetName(String getName) {
        this.name = getName;
    }
}
