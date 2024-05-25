package lesson8.taskNumber2;

import java.util.Arrays;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(int number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }
    public Phone(){};

    public void info(){
        System.out.println(number +" " + model + " " + weight);
    }
    public void receiveCall(String name){
        System.out.println("Calling " + name);
    }
    public void receiveCall(String name, int number){
        System.out.println("Calling " + name + " number " + number);
    }
    public void sendMessage(int... number){
        System.out.println("all number " + Arrays.toString(number));
    }
}
