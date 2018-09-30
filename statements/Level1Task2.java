package statements;

import java.util.Scanner;

public class Level1Task2 {
    public static void main(String[] args) {
        /*Есть 9 этажный дом, в котором 4 подъезда. Номер подъезда начинается с единицы.
         *На одном этаже 4 квартиры.Программа получает номер квартиры с клавиатуры, и выводит
         *на экран на каком этаже, какого подъезда рассположена эта квартира. И если такой
         *квартиры нет в этом доме то выводится сообщение об этом.*/
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер квартиры :");
            int apartment = sc.nextInt();
            if (apartment > 144 || apartment < 1) {
                System.out.println("Такой квартиры в этом доме нет.");
            } else {
                int floor = (apartment - 1) % 36 / 4 + 1;
                int entrance = (apartment - 1) / 36 + 1;
                System.out.println(apartment + " квартира находится на " + floor + " этаже в " + entrance + " подъезде.");
            }
        }
    }
}

