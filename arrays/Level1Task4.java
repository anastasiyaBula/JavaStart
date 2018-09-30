package arrays;

import java.util.Scanner;

public class Level1Task4 {
    public static void main(String[] args) {
        /*Программа считывает сколько букв 'b' в тексте.*/
        Scanner sc = new Scanner(System.in);
        //Считываем текст :
        System.out.println("Input your text :");
        String st = sc.nextLine();
        String[] array = st.split("");
        // Считаем сколько символов 'b' в тексте :
        int count = 0;
        for (String i : array) {
            if (i.equalsIgnoreCase("b")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
