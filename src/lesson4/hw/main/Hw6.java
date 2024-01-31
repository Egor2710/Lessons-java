package lesson4.hw.main;

import java.util.Arrays;

/*Создайте два массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из
массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)*/
public class Hw6 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array1 = new int[5];
        int min = -50;
        int max = 100;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = min + (int) (Math.random() * max);
            array1[i] = min + (int) (Math.random() * max);
            sum += array[i];
            sum1 += array1[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        if ((double) sum / array.length < (double) sum1 / array.length) {
            System.out.println("Среднее арифметическое элементов первого массива меньше чем второго");
        } else if ((double) sum / array.length > (double) sum1 / array.length) {
            System.out.println("Среднее арифметическое элементов первого массива больше чем второго");
        } else {
            System.out.println("Средние арифметические элементов первого массива и второго равны");
        }
    }
}
