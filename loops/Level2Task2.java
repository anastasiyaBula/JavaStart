package loops;


public class Level2Task2 {
    public static void main(String[] args) {
        /*Вывести на экран все простые числа от 1 до 100*/
        for (int i = 0; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (j != i && i % j == 0) {
                    break;
                } else if (i == j) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
