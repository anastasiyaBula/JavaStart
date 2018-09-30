package files;

import java.io.File;
import java.util.Scanner;

public class Level1Task3 {
    /*Реалезация метода который выводит на экран список всех каталогов.*/
    public static void main(String[] args) {
        File file = new File(".");
        outputCatalog(file);
    }

    private static void outputCatalog(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println("Folder => " + f);
            }
        }
    }
}
