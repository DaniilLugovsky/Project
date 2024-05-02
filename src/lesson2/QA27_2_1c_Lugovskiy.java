package lesson2;

import java.util.Scanner;

public class QA27_2_1c_Lugovskiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1 -> System.out.println("Это Январь");
            case 2 -> System.out.println("Это Февраль");
            case 3 -> System.out.println("Это Март");
            case 4 -> System.out.println("Это Апрель");
            case 5 -> System.out.println("Это Май");
            case 6 -> System.out.println("Это Июнь");
            default -> System.out.println("Неправильный номер месяца");
        }
    }
}
