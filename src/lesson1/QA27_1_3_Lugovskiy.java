package lesson1;

public class QA27_1_3_Lugovskiy {
    public static void main(String[] args) {
        System.out.println("c = a + x - 10");
        double a = 6.1, c = 3.5;
        double x = c - a + 10;
        System.out.println("a=" + a +" c=" + c +" x=" + x);
        a = 5.2;
        c = 9.2;
        x = c - a + 10;
        System.out.println("a=" + a +" c=" + c +" x=" + x);
    }
}
