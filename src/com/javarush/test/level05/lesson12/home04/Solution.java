package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/
import java.util.Calendar;

public class Solution
{
    public static void main(String[] args)
    {

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH)+ 1;
        int day = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(day + " 0" + month + " " + year);
        //напишите тут ваш код
    }
}
