package lesson4.hw.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Организовать генерацию массива с использованием класса Random. Размер массива ввести с клавиатуры с использованием класса Scanner*/
public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива -");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int min = -100;
        int max = 100;
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array [i] = random.nextInt(max-min+1) + min;
        }
        System.out.println(Arrays.toString(array));
    }
}
