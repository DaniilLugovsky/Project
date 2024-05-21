package lesson7.taskNumber3;

import java.util.Random;
import java.util.Scanner;

public class QA27_7_3_Lugovskiy {
    public static void main(String[] args) {
        System.out.print("Введите колличество животных : ");
        Scanner scanner = new Scanner(System.in);
        Animals[] animal = new Animals[scanner.nextInt()];
        for (int i = 0; i < animal.length; i++) {
            animal[i] = getNextAnimal();
        }

        for (int i = 0; i < animal.length; i++) {
            animal[i].fly();
        }
    }
    private static Animals getNextAnimal(){
        Random random = new Random();
        int nextShapeFlag = random.nextInt( 5);
        if(nextShapeFlag == 0)
            return new Cat("Cat",1);
        else if(nextShapeFlag == 1)
            return new Fish("Fish",2);
        else if(nextShapeFlag == 2)
            return new Raven("Raven",3);
        else if(nextShapeFlag == 3)
            return new Dog("Dog",4);
        else if(nextShapeFlag == 4)
            return new Rat("Rat",5);
        else {
            return new Horse("Horse", 6);
        }
    }
}
