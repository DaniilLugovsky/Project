package lesson7.taskNumber2;

public class Accountant implements JobDisplay {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Accountant(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public void infoJob() {
        System.out.println("Accountant");
    }
}

