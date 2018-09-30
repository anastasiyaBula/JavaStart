package elements.of.the.standard.library;

import java.util.Scanner;

public class Level1Task3 {
    /*C консоли ввести числа в бинарной форме и перевести в десятичную.*/
    public static void main(String[] args) {
        // Считываем число в бинарной форме с консоли :
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в бинарной форме : ");
        String st = sc.nextLine();
        // Переводим в массив целых чисел :
        String[] arr = st.split("");
        int[] array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }
        /* Вызываем метод, который переводит числа с бинарной формы в десятичную
         и присваиваем это число переменной number*/
        int number = getNumber(array);
        // Выводим результат в консоль :
        System.out.println(st + " -> " + number);
    }

    // Метод для перевода числа с бинарной формы в десятичную.
    private static int getNumber(int[] array) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[array.length - 1 - i] & 1) == 1) {
                number += array[array.length - 1 - i] * Math.pow(2, i);
            }
        }
        return number;
    }
}

