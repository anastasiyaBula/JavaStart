package statements;

import java.util.Scanner;

public class Level1Task4 {
    public static void main(String[] args) {
        /*Треугольник существует только тогда, когда сумма любых ее двух сторон больше третьей.
        Вводятся стороны треугольника. Программа указывает сущестует ли треугольник.*/
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        // Вводятся стороны треугольника :
        System.out.println("Input a, first side of the triangle : ");
        a = sc.nextDouble();
        System.out.println("Input b, second side of the triangle : ");
        b = sc.nextDouble();
        System.out.println("Input c, third side of the triangle : ");
        c = sc.nextDouble();
        //  Просчитывается существует ли треугольник :
        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            System.out.println("Such a triangle exists!");
        } else {
            System.out.println("Such a triangle does not exist!");
        }
    }
}
