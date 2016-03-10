package com.javarush.test.level14.lesson08.bonus01;

import sun.font.FontScalerException;

import java.awt.*;
import java.awt.image.ImagingOpException;
import java.rmi.NotBoundException;
import java.rmi.server.ExportException;
import java.security.acl.NotOwnerException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.FormatterClosedException;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        exceptions.add(new NotBoundException());
        exceptions.add(new NotOwnerException());
        exceptions.add(new RuntimeException());
        exceptions.add(new ReflectiveOperationException());
        exceptions.add(new EmptyStackException());
        exceptions.add(new FormatterClosedException());
        exceptions.add(new FontScalerException());
        exceptions.add(new HeadlessException());
        exceptions.add(new SecurityException());

        //Add your code here

    }
}
