package lesson2;

import java.util.Scanner;

public class QA27_2_5_Lugovskiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int serialNum = scanner.nextInt();
        int sumN = 0;
        for (int num = 1; num <= serialNum; num++)
            sumN = sumN + num;
        System.out.println("Сумма всех чисел от 1 до n : " + sumN);
        scanner.close();
    }
}
