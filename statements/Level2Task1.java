package statements;

import java.util.Scanner;

public class Level2Task1 {
    public static void main(String[] args) {
        /*Есть круг с центром в начале координат и радиусом 4.
         * Пользователь вводит с клавиатуры координаты x и y.
         * Программа опредиляет является ли эта точка внутри круга */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x координату : ");
        double x = sc.nextDouble();
        System.out.println("Введите y координату : ");
        double y = sc.nextDouble();
        double radius = 4;
        double h = Math.sqrt((x * x) + (y * y));
        if (h <= radius) {
            System.out.println("Точка не принадлежит кругу.");
        } else {
            System.out.println("Точка принадлежит кругу.");
        }
    }
}
