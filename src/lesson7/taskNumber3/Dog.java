package lesson7.taskNumber3;

public class Dog extends Animals{
    private int lenghtOfTail;
    public int getLenghtOfTail() {
        return lenghtOfTail;
    }

    public void setLenghtOfTail(int lenghtOfTail) {
        this.lenghtOfTail = lenghtOfTail;
    }

    public Dog(String name, int id) {
        super(name, id);
    }


    @Override
    public void say() {
        System.out.println(getName() + " barks");
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
