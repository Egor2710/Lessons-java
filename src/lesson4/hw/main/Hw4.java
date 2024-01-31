package lesson4.hw.main;

import java.util.Arrays;
import java.util.Scanner;

/*Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть число задается с консоли.
Если такого числа нет - выведите сообщение об этом. В результате должен быть новый массив без указанного числа.*/
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
        int counter = 0;
        System.out.println("Введите число для поиска в массиве");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                counter++;
            }
        }
        if (counter != 0) {
            for (int j = 0; j < counter; j++) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == number) {
                        for (int k = i; k < array.length - 1; k++) {
                            array[k] = array[k + 1];
                        }

                    }
                }
            }
            System.out.println(Arrays.toString(array));
            int[] array1 = new int[length - counter];
            for (int i = 0; i < array.length - counter; i++) {
                array1[i] = array[i];
            }
            System.out.println(Arrays.toString(array1));
        } else
            System.out.println("Такого числа в массиве нет");
    }
}
