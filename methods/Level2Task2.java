package methods;

import java.util.Arrays;

public class Level2Task2 {
    /*Число-палиндром с обеих сторон (справа налево и слева направо) читается
     * одинаково. Самое большое число-палиндром, полученное умножением двух
     * двузначных чисел – 9009 = 91 * 99. Найдите самый большой палиндром,
     * полученный умножением двух трехзначных чисел.*/
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int number;
        int max = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                number = i * j;
                if (findPalindrome(number)) {
                    if (max < number) {
                        max = number;
                        n1 = i;
                        n2 = j;
                    }
                }
            }
        }
        System.out.println(max + " = " + n1 + " * " + n2);
    }

    // Метод определяет является ли число палиндромом:
    public static boolean findPalindrome(int number) {
        boolean b = false;
        int[] array = createArray(number);
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - 1 - i]) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        return b;
    }

    //Метод создает из числа массив:
    public static int[] createArray(int number) {
        String s = "" + number;
        String[] newS = s.split("");
        int[] array = new int[newS.length];
        int j = 0;
        for (String i : newS) {
            array[j++] = Integer.parseInt(i);
        }
        return array;
    }
}
