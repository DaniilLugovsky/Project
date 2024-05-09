package lesson4;

/**
 *Задача 0: Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
 * заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
 * задается из консоли.
 */

import java.util.Arrays;
import java.util.Scanner;
public class QA27_4_0_Lugovskiy {
    public static void main(String[] args) {
        int[][][] multiArray = new int[5][5][5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число на каторое, хотитите увеличить все еденицы многомерного массива : ");
        int increase = scanner.nextInt();
        for (int i = 0; i < multiArray.length; i++) {
                for (int j = 0; j < multiArray[i].length; j++) {
                    for (int k = 0; k < multiArray[j].length; k++)
                        multiArray[i][j][k] = 1 + increase;
                }
        }
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++)
                System.out.println(Arrays.toString(multiArray[i][j]));
            System.out.println();
        }
        scanner.close();
    }
}
