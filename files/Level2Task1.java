package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Level2Task1 {
    /*Реализация метода для считывания двумерного массива из файла.*/
    public static void main(String[] args) {
        File file = new File("a.txt");
        int[][] array = stringInInt(readArrayFromFile(file));
        outputArray(array);
    }
    // Array Output to the Console.
    private static void outputArray(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    //Method read array from file and writes it to the string.
    public static String readArrayFromFile(File file) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String text;
            for (; (text = br.readLine()) != null; ) {
                sb.append(text);
                sb.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        return sb.toString();
    }
    //Method divides the string into an array and writes it into a two-dimensional array of integers.
    static int[][] stringInInt(String text) {
        String[] sArray = text.split(System.lineSeparator());
        int[][] array = new int[sArray.length][];
        for (int i = 0; i < sArray.length; i++) {
            String[] s = sArray[i].split("[\\s]+");
            array [i] = new int [s.length];
            for (int j = 0; j < s.length; j++) {
                array[i][j] = Integer.parseInt(s[j]);
            }
        }
        return array;
    }
}
