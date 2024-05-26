package lesson9.taskNumber1;

public class Cat extends Animal{
    private int lives;
    public int getLives() {
        return lives;
    }
    public void setLives(int lives) {
        this.lives = lives;
    }

    public Cat(String name, int id) {
        super(name, id);
    }

    public void say() {
        System.out.println(getName() + " meows");
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
}
