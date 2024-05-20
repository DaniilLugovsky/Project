package lesson7.taskNumber3;

public class Rat extends Animals{
    private String color;

    public Rat(String name, int id) {
        super(name, id);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println(getName() + " beeps");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walking");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats");
    }

    @Override
    public void jump() {
        System.out.println(getName() + " jump");
    }
    @Override
    public void swim() {
        System.out.println(getName() + " floats");
    }
}
