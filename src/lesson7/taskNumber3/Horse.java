package lesson7.taskNumber3;

public class Horse extends Animals{
    private int Speed;

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public Horse(String name, int id) {
        super(name, id);
    }


    @Override
    public void jump() {
        System.out.println(getName() + " jump");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walking");
    }

    @Override
    public void say() {
        System.out.println(getName() + " cackling");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " floats");
    }
}
