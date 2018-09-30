package elements.of.the.standard.library;

import java.util.Scanner;

public class Level2Task2 {
    // We have get Hemming number.
    public static void main(String[] args) {
        // Let's get two number :
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number : ");
        int number1 = sc.nextInt();
        System.out.println("Input second number : ");
        int number2 = sc.nextInt();
        // Using method getHemmingN(), we will find the Hemming number
        // and output this number on the screen :
        int hemmingN = getHemmingN(number1,number2);
        System.out.println("Hamming distance between " + number1 + " and " + " = " + hemmingN);
    }

    //That method will find the Hemming number
    private static int getHemmingN(int number1, int number2) {
        int number = number1 ^ number2;
        int hemmingN = 0;
        for (; number != 0; ) {
            if ((number & 1) == 1) {
                hemmingN++;
            }
            number >>= 1;
        }
        return hemmingN;
    }
}
