package lesson3;

/**
 * Задача 0. Создайте массив целых чисел. Напишете программу, которая выводит
 * сообщение о том, входит ли заданное число в массив или нет.
 * Пусть число для поиска задается с консоли (класс Scanner).
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class QA27_3_0_Lugovskiy {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(20);
        // System.out.println(Arrays.toString(array));    //для проверки кода
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элемент, которой хотите найти в массиве: ");
        int element = scanner.nextInt();
        boolean conclusion = false;
        for (int j : array) {
            if (j == element) {
                conclusion = true;
                break;
            }
        }
        if (conclusion)
            System.out.println("Элемент " +  element + " присутствует в массиве.");
        else
            System.out.println("Элемент " + element + " не найден.");
        scanner.close();
    }
}