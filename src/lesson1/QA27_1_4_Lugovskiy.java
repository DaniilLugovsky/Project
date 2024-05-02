package lesson1;

public class QA27_1_4_Lugovskiy {
    public static void main(String[] args) {
        System.out.println("c = a + x - 10 Уровнение");
        double a = 6.1;
        double c = 3.5;
        double x = c - a + 10;
        final int MAX_X = 11;
        boolean ifXCorrect = x <= MAX_X;
        System.out.println("a=" + a +" c=" + c +" x=" + x + " - Значение переменных" );
        System.out.println("X меньше либо равно Max_x - " + ifXCorrect );
        a = 1.1;
        c = 20.1;
        x = c - a + 10;
        ifXCorrect = x <= MAX_X;
        System.out.println("a=" + a +" c=" + c +" x=" + x + " - Значение переменных");
        System.out.println("X меньше либо равно Max_x - " + ifXCorrect );
        System.out.println("Max_x = " + MAX_X);
    }
}
