package loops;

import java.util.Scanner;

public class Level1Task2 {
    public static void main(String[] args) {
        /*Вычислить факториал числа. Число вводится с клавиатуры.
          Число должно быть не меньше 4 и не больще 16*/

        // Вводится число факториал которого нужно найти :
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number : ");
        int number = sc.nextInt();
        // Вычисление факториала числа :
        if (number < 4 || number > 16) {
            System.out.println("Это число не подходит, введите число не меньше 4 и не больще 16.");
        } else {
            int fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.println("Факториал числа " + number + " = " + fact);
        }
    }
}
