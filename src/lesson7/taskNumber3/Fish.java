package lesson7.taskNumber3;

public class Fish extends Animals{
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Fish(String name, int id) {
        super(name, id);
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
