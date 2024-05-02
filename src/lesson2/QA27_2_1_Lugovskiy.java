package lesson2;

import java.util.Scanner;

public class QA27_2_1_Lugovskiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();
        String Season = "Пора года - ";
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(Season + "Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(Season + "Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(Season + "Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(Season + "Осень");
                break;
            default:
                System.out.println("Неправильный номер месяца");
                break;
        }
    }
}
