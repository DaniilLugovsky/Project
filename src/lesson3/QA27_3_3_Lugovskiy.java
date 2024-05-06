package lesson3;

/**
 * Задача 3. Создайте 2 массива из 5 чисел.
 * Выведите массивы на консоль в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и
 * сообщите, для какого из массивов это значение оказалось больше (либо
 * сообщите, что их средние арифметические равны).
 */

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class QA27_3_3_Lugovskiy {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        Random random = new Random();
        for (int i = 0; i < firstArray.length; i++)
            firstArray[i] = random.nextInt(10);
        int[] secondArray = new int[5];
        for (int i = 0; i < secondArray.length; i++)
            secondArray[i] = random.nextInt(10);
        System.out.println("Первый массив: " + Arrays.toString(firstArray));
        System.out.println("Второй массив: " + Arrays.toString(secondArray));
        double firstArithmeticMean = IntStream.of(firstArray).average().getAsDouble();
        double secondArithmeticMean = IntStream.of(secondArray).average().getAsDouble();
        if( firstArithmeticMean == secondArithmeticMean)
            System.out.println("Средние арихметические элементов двух массивов равны.");
        else if (firstArithmeticMean > secondArithmeticMean)
            System.out.println("Среднее арихметическое элементов первого массива больше, чем среднее арихметическое элементов второго массива.");
        else if (firstArithmeticMean < secondArithmeticMean)
            System.out.println("Среднее арихметическое элементов второго массива больше, чем среднее арихметическое элементов первого массива.");
    }
}
