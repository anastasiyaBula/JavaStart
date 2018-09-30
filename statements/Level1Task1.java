package statements;

import java.util.Scanner;

public class Level1Task1 {
    public static void main(String[] args) {
        // Задача считать 4 числа с клавиатуры и вывести самое большое из них
        Scanner sc = new Scanner(System.in);
        //Считываем 4 числа с клавиатуры:
        System.out.println("Input first Number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Input second Number : ");
        int secondNumber = sc.nextInt();
        System.out.println("Input third Number : ");
        int thirdNumber = sc.nextInt();
        System.out.println("Input fourth Number : ");
        int fourthNumber = sc.nextInt();
        // Найдем самое большое число :
        int max = firstNumber;
        if (secondNumber > max) {
            max = secondNumber;
        }
        if (thirdNumber > max) {
            max = thirdNumber;
        }
        if (fourthNumber > max) {
            max = fourthNumber;
        }
        // Вывод:
        System.out.println("Max = " + max);
    }
}
