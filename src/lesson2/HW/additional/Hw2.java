package lesson2.HW.additional;
/*За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учётом начисления процентов за каждый месяц.
Для вычисления суммы используйте цикл FOR. Пусть сумма вклада будет представлять тип FLOAT.*/

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите сумму вклада -");
        float sum = x.nextFloat();
        Scanner y = new Scanner(System.in);
        System.out.println("Введите количество месяцев вклада -");
        int a = y.nextInt();
        for (int i = 1; i <= a; i++)
        {
            sum += 0.07 * sum;
        }
        System.out.println(sum);
    }
}