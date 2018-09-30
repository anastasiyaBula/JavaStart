package elements.of.the.standard.library;

import java.util.Scanner;


public class Level2Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input row of number :");
        String text = sc.nextLine();
        int[] array = stringToInt(text);
        int minNumber = findMinNum(array);
        //System.out.println("The minimum number that wrote Vovochka = " + minNumber);
    }

    public static int findMinNum(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {

        }
        return min;
    }

    public static int[] stringToInt(String text) {
        String[] s = text.split("");
        int[] array = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            array[i] = Integer.parseInt(s[i]);
        }
        return array;
    }
}
