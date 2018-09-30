package loops;

import java.util.Scanner;

public class Level1Task3 {
    public static void main(String[] args) {
        /*Программа выводит таблицу умножения числа которое вводится с клавиатуры.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, таблицу умножение на которое вы хотите видеть : ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(i + " * " + number + " = " + result);
        }
    }
}
