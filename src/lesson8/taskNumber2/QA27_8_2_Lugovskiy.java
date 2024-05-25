package lesson8.taskNumber2;

public class QA27_8_2_Lugovskiy {
    public static void main(String[] args) {
        Phone iphone = new Phone(4569278,"iphone",150);
        Phone ithone = new Phone(9991324, "ithone", 125);
        Phone ibone = new Phone(8941314,"ibone",100);
        iphone.info();
        ithone.info();
        ibone.info();
        iphone.receiveCall("Bob");
        ithone.receiveCall("Rick");
        ibone.receiveCall("Morty");
        iphone.getNumber();
        ithone.getNumber();
        ibone.getNumber();
        iphone.sendMessage(4569278,9991324,8941314);
    }
}
