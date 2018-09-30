package arrays;

public class Level1Task1 {
    public static void main(String[] args) {
        /*Подсчет нечетных цифр в массиве :*/
        int count = 0;
        int[] array = {0, 5, 2, 4, 7, 1, 3, 19, 6, 12,11,13};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
