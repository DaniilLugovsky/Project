package lesson2;

public class QA27_2_9_Lugovskiy {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int k = 1; k < 11; k++) {
                System.out.print(k * i + " ");
            }
            System.out.println("  ");
        }
    }
}