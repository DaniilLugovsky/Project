package lesson6.taskNumber2;

public class Owner {
    private String name;
    private int id;
    private String phoneNumber;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Owner(String name, int id, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }
    public void infoOwner(){
        System.out.println("-Owner details-");
        System.out.println("Name - " + name);
        System.out.println("id - "+ id);
        System.out.println("Phone number - " + phoneNumber);
    }
}
