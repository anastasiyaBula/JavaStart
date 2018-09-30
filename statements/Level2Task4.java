package statements;

import java.util.Scanner;

public class Level2Task4 {
    public static void main(String[] args) {
        // Вводится шестизначное число. Программа высчитывает является ли число палиндромом.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите шестизначное число : ");
        int number = sc.nextInt();
        int a = number / 100_000;
        int b = number % 100_000 / 10_000;
        int c = number % 10_000 / 1000;
        int d = number % 1000 / 100;
        int e = number % 100 / 10;
        int f = number % 10;

        if ((a == f) && (b == e) && (c == d)) {
            System.out.println("Число является палиндромом!");
        } else {
            System.out.println("Число не является палиндромом!");
        }
    }
}
