package lesson3;

/**
 * Задача 4. Создайте массив из n случайных целых чисел и выведите его на
 * экран.
 * Размер массива пусть задается с консоли и размер массива может быть
 * больше 5 и меньше или равно 10.
 * Создайте второй массив только из чётных элементов первого массива,
 * если они там есть, и вывести его на экран.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class QA27_3_4_Lugovskiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int lengthOfTheFirstArray = 0;
        while (flag) {
            System.out.print("Введите длину массива: ");
            lengthOfTheFirstArray = scanner.nextInt();
            if (lengthOfTheFirstArray > 5 && lengthOfTheFirstArray <= 10)
                flag = false;
            else {
                flag = true;
                System.out.println("Введите коректное значение длины массива - от 6 до 10");
            }
        }
        int[] firstArray = new int[lengthOfTheFirstArray];
        Random random = new Random();
        for (int i = 0; i < firstArray.length; i++)
            firstArray[i] = random.nextInt(20);
        System.out.println("Первый массив - " + Arrays.toString(firstArray));
        int lengthOfTheSecondArray = 0;
        for (int i : firstArray) {
            if (i % 2 == 0 && i != 0)
                lengthOfTheSecondArray++;
        }
        int[] secondArray = new int[lengthOfTheSecondArray];
        int index = 0;
        for (int i : firstArray) {
            if (i % 2 == 0 && i != 0) {
                secondArray[index] = i;
                index++;
            }
        }
        System.out.println("Второй массив - " + Arrays.toString(secondArray) + " : созданный из чётных элементов первого массива");
        scanner.close();
    }
}
