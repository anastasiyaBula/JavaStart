package elements.of.the.standard.library;

public class Level1Task4 {
    public static void main(String[] args) {
        // Вывод числа РI 10 раз. Каждый новый раз выводится больше чисел после запятой.
        for (int i = 2; i < 10+2; i++) {
            System.out.println(String.format("Number PI = %." + i + "f", Math.PI));
        }
    }
}
