package statements;

import java.util.Scanner;

public class Level2Task3 {
    public static void main(String[] args) {
        /*Вводится четырехзначное число билета.
        Программа просчитывает является ли этот билет счастливым. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите четырехзначное число билета: ");
        int number = sc.nextInt();
        int a = number / 1000;
        int b = number % 1000 / 100;
        int c = number % 100 / 10;
        int d = number % 10;
        int sum1 = a + b;
        int sum2 = c + d;
        if (sum1 > 9) {
            sum1 = (sum1 / 10) + (sum1 % 10);
        }
        if (sum2 > 9) {
            sum2 = (sum2 / 10) + (sum2 % 10);
        }
        if (sum1 == sum2) {
            System.out.println("Вы обладатель счастливого билета!");
        } else {
            System.out.println("Вам не повезло :(");
        }
    }
}
