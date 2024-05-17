package lesson6.taskNumber1;

import java.util.Random;

public class CreditCard {
    private final int id;
    private static int nextId = 0;
    private final String accountNumber;
    private double accountAmount = 10;



    public CreditCard(){
        this.id = ++nextId;
        Random random = new Random();
        int one = random.nextInt(8999)+1000;
        int two = random.nextInt(8999)+1000;
        int free = random.nextInt(8999)+1000;
        int four = random.nextInt(8999)+1000;
        String strNumberOne = String.valueOf(one);
        String strNumberTwo = String.valueOf(two);
        String strNumberFree = String.valueOf(free);
        String strNumberFour = String.valueOf(four);
        accountNumber = (strNumberOne +" "+ strNumberTwo +" "+ strNumberFree +" "+ strNumberFour);
        System.out.println("A new bank user has been created, Account number " + accountNumber);
        System.out.println();
    }
    void replenishment (double topUpAmount){
        accountAmount += topUpAmount;
        System.out.println("Account number - " + accountNumber + " , replenished:)" );
        System.out.println("Replenishment : " + topUpAmount + " $");
        System.out.println("Account amount = " + accountAmount + " $");
        System.out.println();
    }
    void withdrawal (double withdrawalAmount){
        if(withdrawalAmount > accountAmount){
            System.out.println("Error");
            System.out.println("There are not enough funds on the card -  " + accountNumber);
            System.out.println("Debiting from the card : " + withdrawalAmount + " $, impossible.");
            System.out.println("-------------------------------------------------");
        }
        else
            accountAmount -= withdrawalAmount;
    }
    void info(){
        System.out.println("id User - " + id);
        System.out.println("Account number - " + accountNumber);
        System.out.println("Account amount - " + accountAmount + " $");
        System.out.println("-------------------------------------------------");
    }
}
