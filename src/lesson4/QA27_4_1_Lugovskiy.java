package lesson4;

/*
 *Задача 1: Шахматная доска
 * Создать программу для раскраски шахматной доски с помощью цикла.
 * Создать двумерный массив char'ов 8х8. С помощью циклов задать элементам
 * циклам значения B(Black) или W(White).
 */

import java.util.Arrays;
public class QA27_4_1_Lugovskiy {
    public static void main(String[] args) {
        char[][] chessBoard = new char[8][8];
        System.out.println(" - Шахматная доска - ");
        for (int i = 0; i < chessBoard.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < chessBoard[i].length; j++) {
                    if (j % 2 == 0)
                        chessBoard[i][j] = 'W';
                    else
                        chessBoard[i][j] = 'B';
                }
            } else {
                for (int j = 0; j < chessBoard[i].length; j++) {
                    if (j % 2 == 0)
                        chessBoard[i][j] = 'B';
                    else
                        chessBoard[i][j] = 'W';
                }
            }
        }
        for (int i = 0; i < chessBoard.length; i++)
            System.out.println(Arrays.toString(chessBoard[i]));
    }
}
