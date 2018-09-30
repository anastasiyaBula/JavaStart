package loops;

import java.util.Scanner;

public class Level1Task4 {
    public static void main(String[] args) {
/*
        Вывести на экран прямоугольник. Высота и ширина вводятся с клавиатуры.
*/
        // Задать высоту и ширину :
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height : ");
        int height = sc.nextInt();
        System.out.println("Input width : ");
        int width = sc.nextInt();
        // Выводим прямоугольник :
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i == 0) || (i == height - 1) || (j == 0) || (j == width - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
