package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
 Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
 Заполнить массивы любыми данными и вывести их на экран.
*/



public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Написать тут ваш код
        int[] temp = {5, 2 ,4, 7, 0};
        ArrayList<int[]> list = new ArrayList<int[]>();

        try {
            for (int i = 0; i < temp.length; i++) {
                int[] array = new int[temp[i]];
                for (int j = 0; j < temp[i]; j++) {
                    array[i] = 2;
                }
                list.add(array);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return (ArrayList<int[]>) list;

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
