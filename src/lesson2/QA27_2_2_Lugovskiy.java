package lesson2;

import java.util.Scanner;

public class QA27_2_2_Lugovskiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вашу температуру: ");
        int t = scanner.nextInt();
        final int NORMAL_T = -5;
        final int COLD_T = -20;
        if ( t > NORMAL_T )
            System.out.println("Тепло");
        else if (t <= NORMAL_T && t > COLD_T)
            System.out.println("Нормально");
        else if (t <= COLD_T )
            System.out.println("Холодно");
        else
            System.out.println("Неправильно введена температура");
        scanner.close();
    }
}
