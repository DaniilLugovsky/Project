package lesson3;

/**
 * Задача 2. Создайте и заполните массив случайным числами и выведете
 * максимальное, минимальное и среднее значение. Пусть будет возможность создавать массив произвольного размера, размер массива вводится с консоли. Если пользователь ввёл не подходящее число, то программа должна
 * просить пользователя повторить ввод.
 * Создайте второй массив только из чётных элементов первого массива,
 * если они там есть, и вывести его на экран.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class QA27_3_2_Lugovskiy{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean flag = true;
            int lengthOfTheFirstArray = 0;
            while (flag) {
                System.out.print("Введите длину массива: ");
                lengthOfTheFirstArray = scanner.nextInt();
                if (lengthOfTheFirstArray <= 0) {
                    flag = true;
                    System.out.println("Ведите коректное значение длины массива, больше 0");
                }
                else
                    flag = false ;
            }
            int[] firstArray = new int[lengthOfTheFirstArray];
            Random random = new Random();
            for (int i = 0; i < firstArray.length; i++)
                firstArray[i] = random.nextInt(20);
            System.out.println("Массив - " + Arrays.toString(firstArray));
            int minimumArrayElement = firstArray[0];
            for (int i = 1; i < firstArray.length; i++)
                if (firstArray[i] < minimumArrayElement)
                    minimumArrayElement = firstArray[i];
            System.out.println("Минимальное значение элемента в массиве " + minimumArrayElement);
            int maximumArrayElement = firstArray[0];
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] >= maximumArrayElement)
                    maximumArrayElement = firstArray[i];
            }
            System.out.println("Максимальное значение элемента в массиве " + maximumArrayElement);
            int sumOfElements = 0;
            for (int i = 0; i < firstArray.length; i++)
                sumOfElements += firstArray[i];
            double firstArithmeticMean = (double) sumOfElements / firstArray.length;
            System.out.println("Среднее арихметическое значение элементов в массиве " + firstArithmeticMean);
            int lengthOfTheSecondArray = 0;
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] % 2 == 0 && firstArray[i] != 0)
                    lengthOfTheSecondArray++;
            }
            int[] secondArray = new int[lengthOfTheSecondArray];
            int index = 0;
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] % 2 == 0 && firstArray[i] != 0) {
                    secondArray[index] = firstArray[i];
                    index++;
                }
            }
            System.out.println(Arrays.toString(secondArray) + " - Массив созданный из чётных элементов первого массива");
            scanner.close();
        }
}
