package lesson7.taskNumber3;

public class Raven extends Animals{
    private int flightAltitude;

    public Raven(String name, int id) {
        super(name, id);
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
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
    public void say() {
        System.out.println(getName() + " croaks");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flies");
    }
}
