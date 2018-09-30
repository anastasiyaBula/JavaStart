package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Level2Task1 {
    /* Код создает двумерный массив и переворачивает его на 90, 180 или 270
     *градусов, в зависим от того, что укажет пользователь.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Создаем двумерный массив :
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (j + 1);
            }
        }
        // Выводим этот массив на экран :
        for (int[] i : array) {
            System.out.println(Arrays.toString(i));
        }
        // Указываем на сколько градусов хотим повернуть массив:
        System.out.println("На сколько градусов повернуть массив?");
        int number = sc.nextInt();
        if (number == 90) {
            //Поворачиваем массив нужное количество раз :
            array = turn(array);
            // Выводим этот массив на экран :
            show(array);
        } else if (number == 180) {
            //Поворачиваем массив нужное количество раз :
            array = turn(turn(array));
            // Выводим этот массив на экран :
            show(array);
        } else if (number == 270) {
            //Поворачиваем массив нужное количество раз :
            array = turn(turn(turn(array)));
            // Выводим этот массив на экран :
            show(array);
        } else {
            System.out.println("Этот массив можно повернуть только на 90,180 или 270 градусов.");
        }
    }

    // Метод выводит массив на экран.
    private static void show(int[][] array) {
        for (int[] i : array) {
            System.out.println(Arrays.toString(i));
        }
    }

    // : Метод переворачивает массив на 90 градусов.
    private static int[][] turn(int[][] array) {
        System.out.println();
        int b;
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = i; j < array.length - 1 - i; j++) {
                b = array[i][j];
                array[i][j] = array[array.length - j - 1][i];
                array[array.length - j - 1][i] = array[array.length - i - 1][array.length - j - 1];
                array[array.length - i - 1][array.length - j - 1] = array[j][array.length - i - 1];
                array[j][array.length - i - 1] = b;
            }
        }
        return array;
    }
}
