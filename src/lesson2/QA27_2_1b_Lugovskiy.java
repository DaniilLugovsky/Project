package lesson2;

import java.util.Scanner;

public class QA27_2_1b_Lugovskiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int mNum = scanner.nextInt();
        String Season = "Пора года, ";
        if (mNum > 11 && mNum < 13 || mNum > 0 && mNum < 3)
            System.out.println(Season + "Зима");
         else if (mNum > 2 && mNum < 6)
            System.out.println(Season + "Весна");
         else if (mNum > 5 && mNum < 9)
            System.out.println(Season + "Лето");
         else if (mNum > 8 && mNum < 12)
            System.out.println(Season + "Осень");
         else
            System.out.println("Неправильный номер месяца");
        scanner.close();
    }
}
