package statements;

import java.util.Scanner;

public class Level1Task3 {
    public static void main(String[] args) {
        /*Введите интересующий вас год.
        Определить високосный ли год и вывести сколько дней в этой году.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год : ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным, в нем 366 дней.");
        } else {
            System.out.println("Год не является високосным, в нем 365 дней.");
        }

    }
}
