package lesson6.taskNumber2;

public class QA27_6_2_Lugovskiy {
    public static void main(String[] args) {
        Owner owner = new Owner("Bob", 7, "454516487");
        Client client = new Client("Dante", 6, 20, true);
        Livingspace livingspace = new Livingspace(50, 100.0, 8);
        Livingspace livingspaceSecond = new Livingspace(100,250, 66, owner , client);
        livingspace.info();
        livingspaceSecond.info();
    }
}
