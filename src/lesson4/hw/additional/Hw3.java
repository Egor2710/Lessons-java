package lesson4.hw.additional;

import java.util.Arrays;
import java.util.Scanner;

/*Создайте массив строк. Заполните его произвольными именами людей. Отсортируйте массив. Результат выведите на консоль.*/
public class Hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива имён -");
        int length = scanner.nextInt();
        String[] array = new String[length];
        System.out.println("Введите выбранное количество имён");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
