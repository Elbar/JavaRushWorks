package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
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

        if(number1 > 0){
            number1 *= 2;
            System.out.println(number1);
        }
        else{
            number1 += 1;
            System.out.println(number1);
        }

        //напишите тут ваш код

    }

}