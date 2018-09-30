package methods;

import java.util.Scanner;

public class Level1Task5 {
    /*Реализовать метод который возвращает количество слов в строке.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Вводим строку:
        System.out.println("Input text: ");
        String text = sc.nextLine();
        // Вызываем нужный нам метод :
        int number = countOfWords(text);
        //Выводим на экран результат:
        System.out.println("In your text " + number + " words.");
    }
    //Метод который возвращает количество слов в строке.
    static int countOfWords(String text) {
        //Разделить строку по пробелу и вносим каждый элемент в массив строк:
        String[] array = text.split(" ");
        // Возвращаем длину массива:
        return array.length;
    }
}
