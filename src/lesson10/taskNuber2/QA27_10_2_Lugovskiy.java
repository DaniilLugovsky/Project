package lesson10.taskNuber2;

import java.util.Scanner;

public class QA27_10_2_Lugovskiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence without third-party characters or numbers");
        while (true) {
            String string = scanner.nextLine();
            if (string.matches("[a-zA-Z- ]+")){
                System.out.println("String: " + string);
                System.out.println("The shortest word: " + shortestWord(string));
                System.out.println("The longest word: " + longestWord(string));
            }
            else {
                System.out.println("Condition fulfilled incorrectly");
                continue;
            }
        }
    }
    public static String shortestWord(String string) {
        if (string.isEmpty())
            return "";
        String[] word = string.split(" ");
        String shortWord = word[0];
        for (String wordOne : word) {
            if (shortWord.length() >= wordOne.length())
                shortWord = wordOne;
        }
        return shortWord;
    }
    public static String longestWord(String string) {
        String[] word = string.split(" ");
        String longWord = word[0];
        for (String wordOne : word) {
            if (longWord.length() <= wordOne.length())
                longWord = wordOne;
        }
        return longWord;
    }
}
