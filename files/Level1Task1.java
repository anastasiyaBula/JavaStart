package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Level1Task1 {
    /*Консольный "текстовый редактор" с возможностью сохранения текста в файл.*/
    public static void main(String[] args) {
        yourText();
    }

    // Method save text in file:
    private static void saveTextInFile(String text) {
        File file = createNewFile();
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
            System.out.println("Your text is saved!");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    //Create new file with a given name:
    private static File createNewFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the file name :");
        String name = sc.nextLine();
        File file = new File(name);
        return file;
    }

    // Method reads text and when you print exit call method that save text in file :
    private static void yourText() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your text. To save text input : 'Exit' in new line.");
        for (; ; ) {
            String st = sc.nextLine();
            if (st.equalsIgnoreCase("exit")) {
                sb.append(System.lineSeparator());
                saveTextInFile(sb.toString());
                break;
            }
            sb.append(st);
            sb.append(System.lineSeparator());
        }
    }

}
