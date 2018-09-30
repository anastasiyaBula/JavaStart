package files;

import java.io.*;
import java.util.Scanner;

public class Level1Task2 {
    /*Метод для сохранения в файл двумерного массива.*/
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6, 7}, {9, 7, 4, 6, 3, 4, 6}, {1, 2, 3, 7, 7, 3, 2}, {345, 86, 97, 54, 2, 6, 77}};
        File file = createNewFile();
        saveArrayIntInFile(array, file);
    }

    // Method create new file with a given name:
    private static File createNewFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the file name :");
        String name = sc.nextLine();
        File file = new File(name);
        return file;
    }

    // Method save array of integers
    static void saveArrayIntInFile(int[][] array, File file) {
        StringBuilder sb = intInStringBuilder(array);
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(sb);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("Done!");
    }

    static StringBuilder intInStringBuilder(int[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int[] row : array) {
            for (int col : row) {
                sb.append(String.format("%-6.6s\t", "" + col));
            }
            sb.append(System.lineSeparator());
        }
        return sb;
    }
}
