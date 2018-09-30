package loops;

import java.util.Scanner;

public class Level2Task3 {
    public static void main(String[] args) {
        /*Вывести на экран песочные часы заданной высоты (нечетное число)*/
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input number : ");
        int number = sc.nextInt();
               int a = 0;
        int b = number;
        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= number; j++) {
                if (j <= number - b || j > b) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            if (a < number / 2) {
                b--;
            } else {
                b++;
            }
            a++;
            System.out.println();
        }
    }
}
