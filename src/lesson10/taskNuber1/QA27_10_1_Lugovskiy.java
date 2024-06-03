package lesson10.taskNuber1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QA27_10_1_Lugovskiy {
    public static void main(String[] args) {
        System.out.println("Enter a document number in the format 1111-aaa-1111-aaa-1a1a");
        Scanner scanner = new Scanner(System.in);
        String number = "";
        Document documentNumber = new Document(number);
        while (true) {
            documentNumber.setNumber(scanner.nextLine());
            if (Document.verificationNumber(documentNumber.getNumber())) {
                System.out.println("Document number: " + documentNumber.getNumber());
                break;
            } else {
                System.out.println("Enter the correct document number format in the format 1111-aaa-1111-aaa-1a1a");
                continue;
            }
        }
        System.out.print("Enter the operation number from 1 to 7: ");
        int operationNumber;
        while (true)
        {
            while (true) {
                Scanner scannerOne = new Scanner(System.in);
                try {
                    operationNumber = scannerOne.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Enter the correct transaction number");
                    continue;
                }
                break;
            }
            if (operationNumber > 0 && operationNumber < 8 ) {
                switch (operationNumber) {
                    case 1 -> Document.firstTwoBlocks(documentNumber.getNumber());
                    case 2 -> Document.numberWithStars(documentNumber.getNumber());
                    case 3 -> Document.lowerCaseLetters(documentNumber.getNumber());
                    case 4 -> Document.upperCaseLetters(documentNumber.getNumber());
                    case 5 -> Document.containsABC(documentNumber.getNumber());
                    case 6 -> Document.numberStartsAt555(documentNumber.getNumber());
                    case 7 -> Document.numberEndsWith1a2b(documentNumber.getNumber());
                }
            }
            else
                System.out.println("Enter the correct transaction number");
            continue;
        }
    }
}
