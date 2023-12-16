package lesson2.HW.additional;

/*Напишите программу которая выводит на консоль таблицу умножения*/
public class Hw3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print(i + "  ");
        }
        System.out.print('\n');
        for (int i = 2; i < 19; i += 2) {
            if (i < 8)
                System.out.print(i + "  ");
            else
                System.out.print(i + " ");
        }
        System.out.print('\n');
        for (int i = 3; i < 28; i += 3) {
            if (i < 8)
                System.out.print(i + "  ");
            else
                System.out.print(i + " ");
        }
        System.out.print('\n');

        for (int i = 4; i < 37; i += 4) {
            if (i < 8)
                System.out.print(i + "  ");
            else
                System.out.print(i + " ");
        }
        System.out.print('\n');
        for (int i = 5; i < 46; i += 5) {
            System.out.print(i + " ");
        }
        System.out.print('\n');
        for (int i = 6; i < 55; i += 6) {
            System.out.print(i + " ");
        }
        System.out.print('\n');
        for (int i = 7; i < 64; i += 7) {
            System.out.print(i + " ");
        }
        System.out.print('\n');
        for (int i = 8; i < 73; i += 8) {
            System.out.print(i + " ");
        }
        System.out.print('\n');
        for (int i = 9; i < 82; i += 9) {
            System.out.print(i + " ");
        }
        System.out.print('\n');
    }
}
