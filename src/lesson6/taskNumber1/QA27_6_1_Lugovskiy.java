package lesson6.taskNumber1;

public class QA27_6_1_Lugovskiy {
    public static void main(String[] args) {
        CreditCard creditCardone = new CreditCard();
        CreditCard creditCardTwo = new CreditCard();
        CreditCard creditCardFree = new CreditCard();
        creditCardone.replenishment(10);
        creditCardTwo.replenishment(100);
        creditCardFree.withdrawal(11);
        creditCardone.info();
        creditCardTwo.info();
        creditCardFree.info();
    }
}
