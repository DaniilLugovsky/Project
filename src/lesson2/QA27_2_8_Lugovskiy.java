package lesson2;

import java.util.Scanner;

public class QA27_2_8_Lugovskiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вашу сумму вклада: ");
        float sum = scanner.nextFloat();
        System.out.print("Введите срок вклада в месяцах: ");
        int numOfMont = scanner.nextInt();
        float itgsum = sum;
        for(int i = 1; i <= numOfMont; i++){
            itgsum += sum * 0.07;
        }
        System.out.printf("После " + numOfMont + " месяцев сумма вклада составит " + itgsum);
        scanner.close();

    }
}
