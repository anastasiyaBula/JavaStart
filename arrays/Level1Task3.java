package arrays;

import java.util.Arrays;

public class Level1Task3 {
    public static void main(String[] args) {
        /*Код создает массив случайных целых чисел размером 15.
         * Далее создает новый массив, размером в два раза больше и заполенный всеми
         * элементами первого массива, а остальные элементы заполнены значениями
         * удвоенными значениями начальных.*/

        // Создаем массив случайных целых чисел размером 15.
        int array[] = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        // Вывод первого массива на экран :
        System.out.println("First array : ");
        System.out.println(Arrays.toString(array));
        // Создание нового массива и заполнение его элементами первого : массива
        int[] array2 = Arrays.copyOf(array, array.length * 2);
        //Остальные элементы заполнены значениями
        //удвоенными значениями начальных :
        for (int i = 0; i < array2.length / 2; i++) {
            array2[i + array.length] = array[i] * 2;
        }
        //Вывод нового массива на экран :
        System.out.println("Second array : ");
        System.out.println(Arrays.toString(array2));
    }
}
