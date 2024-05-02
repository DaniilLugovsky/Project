package lesson2;

import java.util.Scanner;

public class QA27_2_8_Lugovskiy {
    public static void main(String[] args) {
        System.out.print("Введите начальное число: ");
        Scanner scanner = new Scanner(System.in);
        int initialNum = scanner.nextInt();
        System.out.print("Введите шаг: ");
        Scanner scannerTwo = new Scanner(System.in);
        int step = scannerTwo.nextInt();
        System.out.print("Введите критическое значение: ");
        Scanner scannerFree = new Scanner(System.in);
        final int MAX_NUM = scannerFree.nextInt();
        int SeqOfNum;
        if ( step > 0 && MAX_NUM > 0 || step < 0 && MAX_NUM < 0)
        for (SeqOfNum = initialNum; SeqOfNum <= MAX_NUM; SeqOfNum += step)
            System.out.println(SeqOfNum);
        else {
            System.out.println("Вы ввели некоректные значения");
        }
    }
}