package lesson4.hw.main;
/*Организовать ввод массива из потока ввода (клавиатуры) с использованием класса Scanner. Размер массива и его элементы ввести с клавиатуры с использованием класса Scanner.*/

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива -");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите выбранное количество элементов");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
