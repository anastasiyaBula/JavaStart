package methods;

import java.util.Arrays;
import java.util.Scanner;

public class Level2Task1 {
    /*Существуют некие последовательность чисел. Нужно реализовать программу,
     * которая выводит следующий член этой последовательности.*/
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите последовательность чисел :");
            String s = sc.nextLine();
            int[] array = stringToInt(s);
            if (array.length <= 1) {
                System.out.println("Недостаточно элементов для определения типа последовательности.");
            } else {
                int nextNumber = findSequence(array);
                print(array, nextNumber);
            }
        }
    }

    // Метод выводит результат на экран:
    public static void print(int[] array, int nextNumber) {
        if (nextNumber != 0) {
            System.out.println("В последовательность чисел : ");
            System.out.println(Arrays.toString(array));
            System.out.println("следующий элемент " + nextNumber);
        } else {
            System.out.println("Такой последовательности не обнаружено.");
        }
    }

    //Метод разделяет строку и возвращает массив целых чисел:
    public static int[] stringToInt(String text) {
        String[] s = text.split("[,]");
        int[] array = new int[s.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(s[i]);
        }
        return array;
    }

    /*Метод проверяет принадлежат ли числа одной из последовательностей,
     и если это так возвращает следующее за ним число:*/
    public static int findSequence(int[] array) {
        int nextNumber = 0;
        if (findFirstSequence(array)) {
            nextNumber = array[array.length - 1] + (array[1] - array[0]);
            return nextNumber;
        } else if (findSecondSequence(array)) {
            nextNumber = array[array.length - 1] * (array[2] / array[1]);
            return nextNumber;
        } else if (findThirdSequence(array)) {
            int n = -1;
            int count = array[array.length - 1];
            while (count != 0) {
                count /= (array.length);
                n++;
            }
            nextNumber = (int) Math.pow(array.length + 1, n);
            return nextNumber;
        } else
            return nextNumber;
    }

    /*Метод проверяет принадлежит ли массив первой последовательности чисел,
     *если это так возвращает истину:*/
    public static boolean findFirstSequence(int[] array) {
        int interval = array[array.length - 1] - array[array.length - 2];
        boolean b = false;
        int n = array.length - 2;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] - array[n--] == interval) {
                b = true;
            } else {
                b = false;
                break;
            }
        }
        return b;
    }

    /*Метод проверяет принадлежит ли массив второй последовательности чисел,
     *если это так возвращает истину:*/
    public static boolean findSecondSequence(int[] array) {
        double interval = ((double) array[array.length - 1]) / ((double) array[array.length - 2]);
        boolean b = false;
        int n = array.length-2;
        for (int i = array.length - 1; i > 0; i--) {
            if ((double)(array[i]) / (double) (array[n--]) == interval) {
                b = true;
            } else if (array[i] - array[n--] != interval) {
                b = false;
                break;
            }
        }
        return b;
    }

    /* Метод проверяет принадлежит ли массив третьей последовательности чисел,
    * *если это так возвращает истину:*/
    public static boolean findThirdSequence(int[] array) {
        boolean b = false;
        int n = -1;
        int count = array[array.length - 1];
        while (count != 0) {
            count /= (array.length);
            n++;
        }
        for (int i = 0; i < array.length; i++) {
            if (Math.pow(i + 1, n) == array[i]) {
                b = true;
            } else {
                b = false;
            }
        }
        return b;
    }
}
