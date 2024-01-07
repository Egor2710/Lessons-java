package lesson2.hw.additional;
/*За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учётом начисления процентов за каждый месяц.
Для вычисления суммы используйте цикл FOR. Пусть сумма вклада будет представлять тип FLOAT.*/

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада -");
        float sum = scanner.nextFloat();
        System.out.println("Введите количество месяцев вклада -");
        int month = scanner.nextInt();
        for (int i = 1; i <= month; i++)
        {
            sum += 0.07f * sum;
        }
        System.out.println(sum);
    }
}