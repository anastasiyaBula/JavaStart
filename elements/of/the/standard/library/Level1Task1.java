package elements.of.the.standard.library;

import java.util.Calendar;
import java.util.Date;

public class Level1Task1 {
    public static void main(String[] args) {
        /*Программа выводит количество миллисекунд прошедших от того же числа,
         *но в прошлом месяце до сегодняшней даты.*/
        // Создаем экземпляры нужных нам классов :
        Date date = new Date();
        Calendar cl = Calendar.getInstance();

        // Узнаем сколько миллисекунд до текущей даты :
        long millisecondsNow = date.getTime();
        System.out.println(millisecondsNow);

        // Меняем текущий месяц на месяц который был до этого :
        int monthBeforeThat = cl.get(Calendar.MONTH) - 1;
        cl.set(Calendar.MONTH, monthBeforeThat);
        date = cl.getTime();

        // Узнаем сколько миллисекунд до этого же числа, но в прошлом месяце :
        long milsecInMonthBefore = date.getTime();
        System.out.println(milsecInMonthBefore);

        // Узнаем сколько миллисекунд от прошлого месяца до этого :
        long distance = millisecondsNow - milsecInMonthBefore;
        System.out.println(distance);
    }
}
