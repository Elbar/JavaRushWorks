package com.javarush.test.level07.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно заменить функциональность программы
Задача:  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/
//
//public class Solution
//{
//    public static void main(String[] args) throws IOException
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        ArrayList<String> list = new ArrayList<String>();
//
//        while (true)
//        {
//            String s = reader.readLine();
//            if (s.isEmpty()) break;
//            ArrayList<String> list2 = new ArrayList<String>();
//
//        }
//
//        ArrayList<String> listNew = new ArrayList<String>();
//        for (int i = 0; i < list.size(); i++)
//        {
//            String s = list.get(i);
//            if (s.length() % 2 == 0)
//            {
//                listNew.add(s + "" + s);
//            }
//            else
//            {
//                listNew.add(s + " " + s + " " + s);
//
//            }
//            }
//
//        for (int i = 0; i < listNew.size(); i++)
//        {
//            System.out.println(listNew.get(i));
//        }
//    }
//}

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true)                                        //заполняем список list
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listNew = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i); // переменной s присваиваем значение из списка list из ячейки под номером i
            if (s.length() % 2 == 0) // удваиваем строку если четное значение
            {
                listNew.add(s + " " + s);
            }
            else listNew.add(s + " " + s + " " + s); // утраиваем строку если нечетное значение
        }

        for (int i = 0; i < listNew.size(); i++) // выводим на экран список listNew
        {
            System.out.println(listNew.get(i));
        }
    }

}
