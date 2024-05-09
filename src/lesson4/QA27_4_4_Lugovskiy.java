package lesson4;

/**
 *Задача 4: Создайте двумерный массив целых чисел. Отсортируйте элементы в строках
 * двумерного массива по а) возрастанию а*) убыванию
 */

import java.util.Arrays;
import java.util.Random;
public class QA27_4_4_Lugovskiy {
    public static void main(String[] args) {
        int[][] twoDimensionalArray = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++)
                twoDimensionalArray[i][j] = 1 + random.nextInt(9);
        }
        for (int i = 0; i < twoDimensionalArray.length; i++)
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        System.out.println();
        System.out.println("Массив в котором строки отсортированны по возрастанию : ");
        int cop;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                for (int k = 0; k < twoDimensionalArray[i].length - 1; k++) {
                    if (twoDimensionalArray[i][k] > twoDimensionalArray[i][k + 1]) {
                        cop = twoDimensionalArray[i][k + 1];
                        twoDimensionalArray[i][k + 1] = twoDimensionalArray[i][k];
                        twoDimensionalArray[i][k] = cop;
                    }
                }
            }
        }
        for (int i = 0; i < twoDimensionalArray.length; i++)
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        System.out.println();
        System.out.println("Массив в котором строки отсортированны по убыванию : ");
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                for (int k = 0; k < twoDimensionalArray[i].length - 1; k++) {
                    if (twoDimensionalArray[i][k] < twoDimensionalArray[i][k + 1]) {
                        cop = twoDimensionalArray[i][k];
                        twoDimensionalArray[i][k] = twoDimensionalArray[i][k + 1];
                        twoDimensionalArray[i][k + 1] = cop;
                    }
                }
            }
        }
        for (int i = 0; i < twoDimensionalArray.length; i++)
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
    }
}
