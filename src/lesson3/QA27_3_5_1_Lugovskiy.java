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
import java.util.Random;
public class QA27_3_5_1_Lugovskiy {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(20);
        int[] firstArray = new int[arrayLength];
        for (int i = 0; i < firstArray.length; i++)
            firstArray[i] = random.nextInt(20);
        System.out.println("Первый массив - " + Arrays.toString(firstArray));
        Scanner scanner = new Scanner(System.in);
        int elementToBeRemoved = 0;
        boolean flag = true;
        while (flag) {
            System.out.print("Введите элемент, которое хотите удалить из массива : ");
            elementToBeRemoved = scanner.nextInt();
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != elementToBeRemoved)
                    flag = true;
                else {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                System.out.println("Данного элемента нет в массиве, выберите другое элемент");
        }
        int lengthOfTheSecondArray = 0;
        for (int i = 0; i < firstArray.length; i++)
            if (firstArray[i] != elementToBeRemoved) {
                lengthOfTheSecondArray++;
            }
        int[] secondArray = new int[lengthOfTheSecondArray++];
        int index = 0;
        for (int i = 0; i < firstArray.length; i++)
            if(firstArray[i] != elementToBeRemoved){
                secondArray[index] = firstArray[i];
                index++;
            }
        System.out.println("Массив без данного числа - " + Arrays.toString(secondArray));
        scanner.close();
    }
}
