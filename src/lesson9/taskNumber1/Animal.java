package lesson9.taskNumber1;

public abstract class Animal {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void say() {
        System.out.println(name + " Can't do this");
    }
    public void swim(){
        System.out.println(name + " Can't do this");
    }
    public void jump(){
        System.out.println(name + " Can't do this");
    }
    public  void eat(){
        System.out.println(name + " Can't do this");
    }
    public  void walk(){
        System.out.println(name + " Can't do this");
    }
}
