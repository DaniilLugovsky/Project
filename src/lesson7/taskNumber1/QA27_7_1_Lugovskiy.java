package lesson7.taskNumber1;

import java.util.Random;
import java.util.Scanner;

public class QA27_7_1_Lugovskiy {
    public static void main(String[] args) {
        System.out.print("Введите число фигур : ");
        Scanner scanner = new Scanner(System.in);
        Figures[] figures = new Figures[scanner.nextInt()];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = getNextFigure();
        }
        double sumOfPerimetr = 0;

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Периметр фигуры : "+ figures[i].getName() + " = " + figures[i].getSquare());
            sumOfPerimetr += figures[i].getPerimeter();
        }
        System.out.println("Cумма периметров всех фигур = " + sumOfPerimetr);
    }
    private static Figures getNextFigure(){
        Random random = new Random();
        int nextShapeFlag = random.nextInt( 3);
        if(nextShapeFlag == 0)
            return new Cirkle(random.nextDouble(5)+ 1);
        else if (nextShapeFlag == 1)
            return new Triangle(random.nextDouble(5)+ 1, random.nextDouble(5)+ 1);
        else {
            return new Rectangle(random.nextDouble(5)+ 1,random.nextDouble(5)+ 1);
        }
    }
}
