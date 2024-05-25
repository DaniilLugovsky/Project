package lesson8.taskNumber3;

import java.util.Random;
import java.util.Scanner;

public class QA27_8_3_Lugovskiy {
    public static void main(String[] args) {
        System.out.print("Enter the number of animals : ");
        Scanner scanner = new Scanner(System.in);
        Animal[] animal = new Animal[scanner.nextInt()];
        for (int i = 0; i < animal.length; i++) {
            animal[i] = getNextAnimal();
        }

        for (int i = 0; i < animal.length; i++) {
            animal[i].walk();
        }
        scanner.close();
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
