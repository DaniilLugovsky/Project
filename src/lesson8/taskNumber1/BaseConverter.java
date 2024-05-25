package lesson8.taskNumber1;

import java.util.Scanner;

import static lesson8.taskNumber1.TypesOfDegrees.*;

public class BaseConverter {
    private double quantity;
    private TypesOfDegrees typeConvertibleFirst;
    private TypesOfDegrees typeConvertibleSecond;

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double valueOne) {
        this.quantity = valueOne;
    }

    public TypesOfDegrees getTypeConvertibleFirst() {
        return typeConvertibleFirst;
    }

    public void setTypeConvertibleFirst(TypesOfDegrees typeConvertibleFirst) {
        this.typeConvertibleFirst = typeConvertibleFirst;
    }

    public TypesOfDegrees getTypeConvertibleSecond() {
        return typeConvertibleSecond;
    }

    public void setTypeConvertibleSecond(TypesOfDegrees typeConvertibleSecond) {
        this.typeConvertibleSecond = typeConvertibleSecond;
    }

    public void convert (TypesOfDegrees typeConvertibleFirst, double quantity, TypesOfDegrees typeConvertibleSecond){
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
        TypesOfDegrees firstTypeOfDegrees = TypesOfDegrees.valueOf(scanner.next());
        System.out.print("Enter the number of degrees : ");
        int numberOfDegrees = scanner.nextInt();
        System.out.print("Enter the type you want to convert to : ");
        TypesOfDegrees secondTypeOfDegrees = TypesOfDegrees.valueOf(scanner.next());
        convert(firstTypeOfDegrees, numberOfDegrees, secondTypeOfDegrees);
        scanner.close();
    }
}
