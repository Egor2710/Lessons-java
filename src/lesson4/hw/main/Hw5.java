package lesson4.hw.main;

import java.util.Arrays;
import java.util.Scanner;

/*Создайте и заполните массив случайными числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(). Пусть будет возможность создавать массив
произвольного размера. Пусть размер массива вводится с консоли.*/
public class Hw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива -");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int a = -50;
        int b = 100;
        int max = array[0];
        int min = array[0];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = a + (int) (Math.random() * b);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число массива: " + max);
        System.out.println("Минимальное число массива: " + min);
        System.out.println("Среднее число массива: " + (double) sum / length);
    }
}
