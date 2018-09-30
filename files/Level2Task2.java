package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Level2Task2 {
    /*Считать текст из файла на английском языке.
     *Вывести статистику использования конкретных букв от чаще до реже использованых.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of file : ");
        File file = new File(sc.nextLine());
        char[] c = loadTextFromFile(file).toCharArray();
        numberOfElementInArray(c);
    }

    // Method load text from your file :
    static String loadTextFromFile(File file) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String text = "";
            for (; (text = br.readLine()) != null; ) {
                sb.append(text);
                sb.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return sb.toString();
    }

    //Method counts hove many times the letter was found in the file and create new array :
    static void numberOfElementInArray(char[] s) {
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int count = 0;
        int[][] array = new int[a.length][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (a[i] == s[j]) {
                    count++;
                }
            }
            array[i][0] = a[i];
            array[i][1] = count;
            count = 0;
        }
        sortNewArray(array);
    }

    // Method sort new array :
    private static void sortNewArray(int[][] array) {
        Arrays.sort(array, Comparator.comparingInt(arr -> -1 * (arr[1])));
        showsNewArray(array);
    }

    // Method shows new array :
    private static void showsNewArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (j == 0) {
                    char ch = (char) array[i][j];
                    System.out.print(ch + " ");
                }
                System.out.print(array[i][1] + " ");
            }
            System.out.println();
        }
    }
}
