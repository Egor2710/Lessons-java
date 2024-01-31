package lesson4.hw.additional;

import java.util.Arrays;
import java.util.Scanner;

/*Создайте массив из n случайных целых чисел и выведите его на экран. Размер массива пусть задается с консоли
и размер массива может быть больше 5 и меньше или равно 10. Если n не удовлетворяет условию - выведите сообщение об этом.
Если пользователь ввел не подходящее число, то программа должна просить пользователя повторить ввод. Создайте второй массив
только из чётных элементов первого массива, если они там есть, и вывести его на экран.*/
public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива в диапазоне от больше 5 до меньше или равно 10 -");
        boolean fact = true;
        int counter = 0;
        while (fact) {
            int length = scanner.nextInt();
            if ((5 < length) & (length <= 10)) {
                fact = false;
                int[] array = new int[length];
                System.out.println("Введите выбранное количество целых элементов");
                for (int i = 0; i < array.length; i++) {
                    array[i] = scanner.nextInt();
                    if (array[i] % 2 != 0) {
                        counter++;
                    }
                }
                System.out.println(Arrays.toString(array));
                if (counter != 0) {
                    for (int j = 0; j < (counter); j++) {
                        for (int i = 0; i < array.length; i++) {
                            if (array[i] % 2 != 0) {
                                for (int k = i; k < array.length - 1; k++)
                                    array[k] = array[k + 1];
                            }
                        }
                    }
                    /* System.out.println(Arrays.toString(array));*/
                    int[] array1 = new int[length - counter];
                    for (int i = 0; i < (length - counter); i++) {
                        array1[i] = array[i];
                    }
                    System.out.println(Arrays.toString(array1));
                } else {
                    System.out.println("Исходный массив состоит только из чётных элементов");
                }
            } else {
                System.out.println("Введённое число не удовлетворяет условию");
                System.out.println("Повторите ввод размера массива в диапазоне от больше 5 до меньше или равно 10 -");
            }
        }
    }
}

