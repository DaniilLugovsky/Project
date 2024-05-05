package lesson3;

/**
 * Задача 6. Реализуйте алгоритм сортировки пузырьком. (по не возрастанию!)
 */

import java.util.Arrays;
import java.util.Random;
public class QA27_3_6_Lugovskiy {
    public static void main(String[] args) {
        Random random = new Random();
        int length = random.nextInt(20);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(20);
        System.out.println("Массив - " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if(array[j] < array[j+1]) {
                    int temporaryRecording = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temporaryRecording; }
        System.out.println("Отсортированный массив по убыванию - " + Arrays.toString(array));
    }
}
