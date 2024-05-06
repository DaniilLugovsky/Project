package lesson3;

/**
 * Задача 1. Создайте массив целых чисел. Удалите все вхождения заданного
 * числа из массива.
 * Пусть число задается с консоли (класс Scanner). Если такого числа нет -
 * выведите сообщения об этом.
 * В результате должен быть новый массив без указанного числа.
 */

import java.util.Arrays;
import java.util.Scanner;
public class QA27_3_5_1_Lugovskiy {
    public static void main(String[] args) {
        int arrayLength = 2 + (int) ( Math.random() * 20 );
        int[] firstArray = new int[arrayLength];
        for (int i = 0; i < firstArray.length; i++)
            firstArray[i] = (int) ( Math.random() * 20 );
        System.out.println("Первый массив - " + Arrays.toString(firstArray));
        Scanner scanner = new Scanner(System.in);
        int elementToBeRemoved = 0;
        boolean flag = true;
        while (flag) {
            System.out.print("Введите элемент, которое хотите удалить из массива : ");
            elementToBeRemoved = scanner.nextInt();
            for (int j : firstArray) {
                if (j != elementToBeRemoved);
                else {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Данного элемента нет в массиве, выберите другое элемент");
        }
        int lengthOfTheSecondArray = 0;
        for (int j : firstArray) {
            if (j != elementToBeRemoved) {
                lengthOfTheSecondArray++;
            }
        }
        int[] secondArray = new int[lengthOfTheSecondArray];
        int index = 0;
        for (int j : firstArray) {
            if (j != elementToBeRemoved) {
                secondArray[index] = j;
                index++;
            }
        }
        System.out.println("Массив без данного числа - " + Arrays.toString(secondArray));
        scanner.close();
    }
}
