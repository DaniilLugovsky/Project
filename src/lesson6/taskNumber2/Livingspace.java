package lesson6.taskNumber2;


public class Livingspace {
    private int square;
    private double price;
    private int id;
    private Owner owner;
    private Client client;

    public int getPlohad() {
        return square;
    }

    public void setPlohad(int plohad) {
        this.square = plohad;
    }

    public double getStoim() {
        return price;
    }

    public void setStoim(double stoim) {
        this.price = stoim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public Livingspace(int square, double stoim, int id, Owner owner, Client client) {
        this.square = square;
        this.price = stoim;
        this.id = id;
        this.owner = owner;
        this.client = client;
    }
    public Livingspace(int square, double stoim, int id) {
        this.square = square;
        this.price = stoim;
        this.id = id;
    }
    void info(){
        System.out.println("-------Living space data-------");
        System.out.println("Square - " + square + " square meters");
        System.out.println("Price : " + price + " $");
        System.out.println("Id - " + id);
        if (owner == null)
            System.out.print("");
        else
            owner.infoOwner();
        if (client == null)
            System.out.print("");
        else
            client.infoClient();
    }
}
