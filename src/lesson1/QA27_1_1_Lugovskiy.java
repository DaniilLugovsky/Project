package lesson1;

import java.util.Scanner;

public class QA27_1_1_Lugovskiy {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите ваш ник: ");
        if (scaner.hasNextLine()) {
            String name = scaner.nextLine();
            System.out.println("Чего изволите господин, " + name);
        }
    }
}