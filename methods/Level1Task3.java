package methods;

import java.util.Scanner;

public class Level1Task3 {
    /*Реализовать метод рисующий на экран прямоугольник из звездочек
     * его параметры : высота и ширина прямоугольника.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Задаем высоту прямоугольника:
        System.out.println("Input the height of the rectangle :");
        int height = sc.nextInt();
        //Задаем ширину прямоугольника:
        System.out.println("Input the width of the rectangle :");
        int width = sc.nextInt();
        System.out.println();
        //Вызываем метод который рисует прямоугольник:
        drawRectangle(height, width);
    }

    //Метод который рисует прямоугольник заданной высоты и ширины.
    static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
