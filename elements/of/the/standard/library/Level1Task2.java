package elements.of.the.standard.library;

public class Level1Task2 {
    /*Написать свой вариант метода Arrays.toString() для int[].*/
    public static void main(String[] args) {
        int[] array = {12, 3, 4, 6, 7, 5, 3};
        // Вызываем свой метод Arrays.toString() :
        String s = toString(array);
        // Выводим строку на экран :
        System.out.println(s);
    }

    // Реализация своего метода Arrays.toString()
    static String toString(int[] array) {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            s.append(array[i]);
            if (i == array.length - 1) {
                s.append("]");
            } else {
                s.append(",");
            }
        }
        return s.toString();
    }
}
