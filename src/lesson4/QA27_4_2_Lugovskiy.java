package lesson4;

/**
 *Задача 2: Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
 * элементов массива.
 */

import java.util.Arrays;
import java.util.Random;
public class QA27_4_2_Lugovskiy {
    public static void main(String[] args) {
        int[][] twoDimensionalArray = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++)
                twoDimensionalArray[i][j] = 5 + random.nextInt(15);
        }
        for (int i = 0; i < twoDimensionalArray.length; i++)
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        int sumOfArrayElements = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++)
                sumOfArrayElements += twoDimensionalArray[i][j];
        }
        System.out.println("Сумма элементов двумерного массива : " + sumOfArrayElements);
    }
}
