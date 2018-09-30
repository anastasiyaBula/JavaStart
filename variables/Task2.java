package variables;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Задача рассчитать площадь треугольника и выводит результат на экран*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Вычислим площадь треугольника.");
        //Зададим стороны треугольника :
        System.out.println("Введите первую сторону треугольника : ");
        double a = sc.nextDouble();
        System.out.println("Введите вторую сторону треугольника : ");
        double b = sc.nextDouble();
        System.out.println("Введите третью сторону треугольника : ");
        double c = sc.nextDouble();
        // Площадь треугольника равна :
        double p = (a + b + c) / 2;
        System.out.println("Площадь треугольника равна : " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}
