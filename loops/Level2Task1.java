package loops;

import java.util.Scanner;

public class Level2Task1 {
    public static void main(String[] args) {
        /*С помощью только одного цикла нарисовать
         фигуру заданной, с клавиатуры, высоты. */
        Scanner sc = new Scanner(System.in);
        // Указываем высоту :
        System.out.println("Input number : ");
        int number = sc.nextInt();
        int a = 1;
        int k = number;
        // Рисуем фигуру :
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
            if (i == a && i != number) {
                System.out.println();
                a++;
                i = 0;
            }
            if (i == k) {
                k--;
                number--;
                i = 0;
                System.out.println();
            }
        }
    }
}
