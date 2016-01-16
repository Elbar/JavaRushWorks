package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String n = bufferedReader.readLine();
        String n1 = bufferedReader.readLine();

        int number = Integer.parseInt(n);
        int number1 = Integer.parseInt(n1);


        if(number < number1)
        {
            System.out.print(number);
        }
        else
        {
            System.out.print(number1);
        }

    }
}