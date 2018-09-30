package loops;

import java.util.Scanner;

public class Level1Task1 {
    public static void main(String[] args) {
        /*C помощью цикла нарисовать обои.
        Количество полос вводятся с клавиатуры.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number : ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j % 2 == 0) {
                    System.out.print("***");
                } else {
                    System.out.print("+++");
                }
            }
            System.out.println();
        }
    }
}
