package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Level1Task2 {
    public static void main(String[] args) {
        /* Код создает массив целых чисел (длина задается с клавиатуры)
         * и заполняется вручную. Вывод массива на экран.*/
        Scanner sc = new Scanner(System.in);
        // Задаем размер массива :
        System.out.println("Input size of array : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        // Заполнение массива :
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input " + (i + 1) + " array element");
            array[i] = sc.nextInt();
        }
        // Вывод заполненого массива на экран :
        System.out.println(Arrays.toString(array));
    }
}
