package lesson4.hw.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Создайте массив целых чисел. Напишите программу, которая выводит сообщение о том, входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли.*/
public class Hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива -");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int min = -100;
        int max = 100;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Введите число для поиска в диапазоне от -100 до 100");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Данное число входит в массив");
            }
            else if (i == length-1)
            {
                System.out.println("Данное число не входит в массив");
            }
        }
    }
}
