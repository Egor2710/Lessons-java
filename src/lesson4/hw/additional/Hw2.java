package lesson4.hw.additional;

import java.util.Arrays;
import java.util.Scanner;
/*Создайте массив и заполните массив.Выведите массив на экран в строку.Замените каждый элемент с нечётным индексом
на ноль.Снова выведите массив на экран на отдельной строке.*/

public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива -");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int min = -50;
        int max = 100;
        for (int i = 0; i < array.length; i++) {
            array [i] = min + (int) (Math.random() * max);
        }
        System.out.println(Arrays.toString(array));
        for (int i=2; i < array.length; i = i +2)
        {
            array [i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
