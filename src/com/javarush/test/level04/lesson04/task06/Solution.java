package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number = bufferedReader.readLine();


        int number1 = Integer.parseInt(number);


        if(number1 == 1)
        {
            System.out.println("понедельник");
        }else if(number1 == 2)
        {
            System.out.println("вторник");

        }else if (number1 == 3)
        {
            System.out.println("среда");

        }else if(number1 == 4)
        {
            System.out.println("четверг");

        }else if (number1 == 5)
        {
            System.out.println("пятница");

        }
        else if (number1 == 6)
        {
            System.out.println("суббота");

        }
        else if (number1 == 7)
        {
            System.out.println("Воскресенье");
        }
        else
        {
            System.out.println("такого дня недели не существует");
        }
    }

}