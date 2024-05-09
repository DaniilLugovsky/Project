package lesson4;

/**
 Задача 3: Создайте двумерный массив. Выведите на консоль диагонали массива.
 */

import java.util.Arrays;
import java.util.Random;
public class QA27_4_3_Lugovskiy {
    public static void main(String[] args) {
        int[][] twoDimensionalArray = new int[8][8];
        Random random = new Random();
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++)
                twoDimensionalArray[i][j] = 1 + random.nextInt(9);
        }
        for (int i = 0; i < twoDimensionalArray.length; i++)
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        System.out.print("Элементы главной диагонали массива : ");
        int horizontalIndex = 0;
        int verticalIndex = 0;
        while (horizontalIndex <= twoDimensionalArray.length - 1 && verticalIndex <= twoDimensionalArray.length - 1) {
            System.out.print(twoDimensionalArray[verticalIndex][horizontalIndex] + "  ");
            horizontalIndex++;
            verticalIndex++;
        }
        System.out.println();
        System.out.print("Элементы побочной диаганали массива : ");
        horizontalIndex = twoDimensionalArray.length - 1;
        verticalIndex = 0;
        while (horizontalIndex >= 0 && verticalIndex < twoDimensionalArray.length) {
            System.out.print(twoDimensionalArray[verticalIndex][horizontalIndex] + "  ");
            horizontalIndex--;
            verticalIndex++;
        }
    }
}
