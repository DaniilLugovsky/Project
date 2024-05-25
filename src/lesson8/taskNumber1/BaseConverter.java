package lesson8.taskNumber1;

import java.util.Scanner;

import static lesson8.taskNumber1.TypeOfDegrees.*;

public class BaseConverter {
    private double quantity;
    private TypeOfDegrees typeConvertibleFirst;
    private TypeOfDegrees typeConvertibleSecond;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double valueOne) {
        this.quantity = valueOne;
    }

    public TypeOfDegrees getTypeConvertibleFirst() {
        return typeConvertibleFirst;
    }

    public void setTypeConvertibleFirst(TypeOfDegrees typeConvertibleFirst) {
        this.typeConvertibleFirst = typeConvertibleFirst;
    }

    public TypeOfDegrees getTypeConvertibleSecond() {
        return typeConvertibleSecond;
    }

    public void setTypeConvertibleSecond(TypeOfDegrees typeConvertibleSecond) {
        this.typeConvertibleSecond = typeConvertibleSecond;
    }

    public void convert (TypeOfDegrees typeConvertibleFirst, double quantity, TypeOfDegrees typeConvertibleSecond){
        if (typeConvertibleFirst == C){
            switch (typeConvertibleSecond){
                case F -> System.out.println((1.8 * quantity) + 32 + " fahrenheit");
                case K -> System.out.println(quantity + 273.15 + " kelvin");
                case C -> System.out.println(quantity + " celsius");
            }
        }
        else if(typeConvertibleFirst == K){
            switch (typeConvertibleSecond){
                case C -> System.out.println(quantity - 273.15 + " celsius");
                case F -> System.out.println((quantity - 273.15) * 9/5 + 32 + " fahrenheit");
                case K -> System.out.println(quantity + " kelvin");
            }
        }else if(typeConvertibleFirst == F){
            switch (typeConvertibleSecond){
                case C -> System.out.println((quantity - 32) * 5/9 + " celsius");
                case K -> System.out.println((quantity - 32) * 5/9 + 273.15 + " kelvin");
                case F -> System.out.println(quantity + " fahrenheit");
            }
        }
    }
    public void conversion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Types of degrees : C (CELSIUS), K (KELVIN), F (FAHRENHEIT)");
        System.out.print("Enter the type you want to convert : ");
        TypeOfDegrees firstTypeOfDegrees = TypeOfDegrees.valueOf(scanner.next());
        System.out.print("Enter the number of degrees : ");
        int numberOfDegrees = scanner.nextInt();
        System.out.print("Enter the type you want to convert to : ");
        TypeOfDegrees secondTypeOfDegrees = TypeOfDegrees.valueOf(scanner.next());
        convert(firstTypeOfDegrees, numberOfDegrees, secondTypeOfDegrees);
        scanner.close();
    }
}
