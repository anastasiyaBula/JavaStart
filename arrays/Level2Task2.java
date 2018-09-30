package arrays;

import java.util.Arrays;

public class Level2Task2 {
    /* Код зеркально поворачивает массив.*/
    public static void main(String[] args) {
        // Задаем массив целых чисел :
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Выводит его на экран:
        System.out.println(Arrays.toString(array));
        // Поворачиваем зеркально массив :
        for (int i = 0; i < array.length / 2; i++) {
            int b = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = b;
        }
        // Выводит его на экран:
        System.out.println(Arrays.toString(array));
    }
}
