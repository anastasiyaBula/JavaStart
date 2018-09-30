package variables;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*Задача считать 5-ти значное число с клавиатуры и
          вывести его на экран.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пятизначное число : ");

        /*Считываем число с консоли :*/
        int number = sc.nextInt();

        /*Цифры из которых состоит число : */
        int a = number / 10_000;
        int b = number % 10_000 / 1_000;
        int c = number % 1_000 / 100;
        int d = number % 100 / 10;
        int e = number % 10;

        /*Выводим каждую цифру на экран : */
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
