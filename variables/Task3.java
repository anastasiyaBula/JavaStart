package variables;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*Задача вычислить длину окружности*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Вычислим длину окружности круга.");
        //Зададим длину окружности :
        System.out.println("Введите радиус : ");
        double r = sc.nextDouble();
        //Длина окружности равна :
        double d = 2 * Math.PI * r;
        System.out.println("Длина окружности равна : " + d);
    }
}
