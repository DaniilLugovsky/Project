package lesson9.taskNumber1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QA27_9_1_Lugovskiy{
    public static void main(String[] args) {
        System.out.print("Enter the number of animals : ");
        Animal[] animal = new Animal[0];
        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            try {
                animal = new Animal[scanner1.nextInt()];
            } catch (NegativeArraySizeException e) {
                System.out.println("Array length cannot be negative");
                continue;
            } catch (InputMismatchException e) {
                System.out.println("The length of the array must have a numeric expression");
                continue;
            }
                break;
        }
        for (int i = 0; i < animal.length; i++) {
            animal[i] = getNextAnimal();
        }
        System.out.println("Enter an action for animals to perform");
        int choise;
        while (true) {
            System.out.println("0 - walk, 1 - talk, 2 - jump, 3 - eat, 4 - swim");
            Scanner scanner = new Scanner(System.in);
            try {
                choise = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Action is only a number, not a symbol");
                continue;
            }
            if (choise < 0 || choise > 4) {
                try {
                    throw new IOException();
                }catch (IOException e){
                    System.out.println("Incorrect choice");
                    continue;
                }
            }
            break;
        }
        for (Animal value : animal) {
            switch (choise) {
                case 0 -> value.walk();
                case 1 -> value.say();
                case 2 -> value.jump();
                case 3 -> value.eat();
                case 4 -> value.swim();
            }
        }
    }

    private static Animal getNextAnimal() {
        Random random = new Random();
        int nextShapeFlag = random.nextInt(3);
        UserAnimalChoise userAnimalChoise = UserAnimalChoise.valueOf(nextShapeFlag);
        if (userAnimalChoise == null) {
            System.out.println("Flag was incorrect");
        }

        return switch (userAnimalChoise) {
            case CAT -> new Cat("Cat", 1);
            case DOG -> new Dog("Dog", 3);
            case FISH -> new Fish("Fish", 2);
        };
    }
}
