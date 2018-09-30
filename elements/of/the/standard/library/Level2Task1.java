package elements.of.the.standard.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Level2Task1 {
    /*Задать дату с консоли.
     *Сравнить эту дату с текущей.
     *Вывести на экран отличающееся части.*/
    public static void main(String[] args) {
        //Узнаем текущую дату :
        Date dateNow = new Date();
        Calendar clNow = Calendar.getInstance();
        clNow.setTime(dateNow);

        // Узнаем дату, заданную Вами :
        Date dateYour = new Date();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
        System.out.println("Input date dd:MM:yyyy :");
        String yorYear = sc.nextLine();
        try {
            dateYour = sdf.parse(yorYear);
        } catch (ParseException e) {
            System.out.println(e);

        }
        Calendar clYour = Calendar.getInstance();
        clYour.setTime(dateYour);

        // Сравниваем текущую дату и дату заданную Вами :

        // Если даты равны то выводится строка :
        if (((clNow.get(Calendar.DAY_OF_MONTH)) == (clYour.get(Calendar.DAY_OF_MONTH))) &&
                ((clNow.get(Calendar.MONTH)) == (clYour.get(Calendar.MONTH))) &&
                ((clNow.get(Calendar.YEAR)) == (clYour.get(Calendar.YEAR)))) {
            System.out.println("Your date is the same as the current date.");
        }
        // Если заданный день месяца не равен текущему, выводится день который, был задан :
        if ((clNow.get(Calendar.DAY_OF_MONTH)) != (clYour.get(Calendar.DAY_OF_MONTH))) {
            System.out.print(clYour.get(Calendar.DAY_OF_MONTH) + " ");
        }
        // Если заданный месяц не равен текущему, выводится месяц, который был задан :
        if ((clNow.get(Calendar.MONTH)) != (clYour.get(Calendar.MONTH))) {
            System.out.print((clYour.get(Calendar.MONTH) + 1) + " ");
        }
        // Если заданный год не равен текущему, выводится год, который был задан :
        if ((clNow.get(Calendar.YEAR)) != (clYour.get(Calendar.YEAR))) {
            System.out.print(clYour.get(Calendar.YEAR) + " ");
        }
    }
}
