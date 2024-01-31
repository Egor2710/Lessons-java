package lesson4.hw.additional;

import java.util.Arrays;
import java.util.Scanner;

/*Реализуйте алгоритм сортировки массива*/
public class Hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива -");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите выбранное количество целых элементов");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (key < array[j]) {
                    array[j + 1] = array[j];
                    array[j] = key;
                }
            }
        }
        System.out.println("Отсортированный массив методом вставки:");
        System.out.println(Arrays.toString(array));
    }
}
