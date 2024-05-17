package lesson6.taskNumber2;

public class Client {
    private String name;
    private int id;
    private int age;
    private boolean registration;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRegistration() {
        return registration;
    }

    public void setRegistration(boolean registration) {
        this.registration = registration;
    }
    public Client(String name, int id, int age, boolean registration) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.registration = registration;
    }
    public void infoClient(){
        System.out.println("-Client details-");
        System.out.println("Name - " + name);
        System.out.println("id - " + id);
        System.out.println("Age - " + age);
        System.out.println("Registration - " + registration);
    }
}
