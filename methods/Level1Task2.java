package methods;

import java.util.Scanner;

public class Level1Task2 {
    /*Реализовать метод который принимает целое и вещественное число, а так же строку.
     * Возвращает конкатенацию строки с суммой вещественного и целого числа.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Задаем целое число с клавиатуры:
        System.out.println("Input an integer number: ");
        int a = sc.nextInt();
        //Задаем вещественное число с клавиатуры:
        System.out.println("Input a fractional number : ");
        double d = sc.nextDouble();
        String s = "Sum = ";
        //Вызываем нужный нам метод:
        String sum = getConcat(a, d, s);
        System.out.println(sum);
    }

    //Метод который возвращает конкатанацию строки с суммой вещественного и целого числа.
    static String getConcat(int a, double d, String s) {
        return s + (a + d);
    }
}
