package statements;

import java.util.Scanner;

public class Level2Task2 {
    public static void main(String[] args) {
        /*Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
         *вводит с клавиатуры координаты точки x и y. Программа определит лежит
         *ли эта точка внутри треугольника или нет.*/
        Scanner sc = new Scanner(System.in);
        // Координаты заданных вершин:
        double x1 = 0;
        double y1 = 0;
        double x2 = 4;
        double y2 = 4;
        double x3 = 6;
        double y3 = 1;
        // Задаются координаты точки x и y
        System.out.println("Введите x координату : ");
        double x = sc.nextDouble();
        System.out.println("Введите y координату : ");
        double y = sc.nextDouble();
       /* Определяется лежит ли эта точка внутри треугольника или нет.
        Результат выводится на экран :*/
        double a = (x - x1) * (y1 - y2) - (y - y1) * (x1 - x2);
        double d = (x - x2) * (y2 - y3) - (y - y2) * (x2 - x3);
        double c = (x - x3) * (y3 - y1) - (y - y3) * (x3 - x1);
        if ((a > 0) && (d > 0) && (c > 0) || (a < 0) && (d < 0) && (c < 0)) {
            System.out.println("Точка принадлежит треугольнику.");
        } else {
            System.out.println("Точка не принадлежит треугольнику.");
        }
    }
}
