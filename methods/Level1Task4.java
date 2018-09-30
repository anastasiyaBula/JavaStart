package methods;

import java.util.Scanner;

public class Level1Task4 {
    /*Реализовать метод который ищет элемент в массиве целых чисел и возвращает индекс этого элемента.
     *Если такого элемента нет в массиве возвращает -1.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Массив целых чисел:
        int[] array = {1, 102, 31, 5, 4, 6, 17, 8, 9, 91, 18};
        // Указываем какой элемент будем искать:
        System.out.println("Index of what number You wand to find?");
        int number = sc.nextInt();
        // Вызываем метод который ищет элемент в массиве целых чисел и возвращает индекс этого элемента:
        int index = findElement(array, number);
        //Выводим результат на экран:
        System.out.println("Index of " + number + " = " + index);
    }

    /*Метод который ищет элемент в массиве целых чисел и возвращает индекс этого элемента.
    Если такого элемента нет в массиве возвращает -1.*/
    static int findElement(int[] array, int number) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        return index;
    }
}
