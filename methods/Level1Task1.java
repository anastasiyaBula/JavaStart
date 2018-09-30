package methods;

public class Level1Task1 {
    /*Написать метод который вернет максимальное число из массива целых чисел.*/
    public static void main(String[] args) {
        //Создаем массив целых чисел:
        int[] array = {-4, -2, 3, -12, -190, 65};
        //Вызываем метод который вернет нам максимальное число:
        int max = maxNumber(array);
        //Выводим это число на экран:
        System.out.println(max);
    }

    //Метод который возвращает максимальное число из массива целых чисел.
    static int maxNumber(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
