package lesson2;

public class QA27_2_3_Lugovskiy {
    public static void main(String[] args) {
        for ( int number = 1; number < 100; number++ )
            if ( number % 2 != 0)
                System.out.println(number);
        System.out.println("Нечётные числа от 1 до 100");
    }
}
