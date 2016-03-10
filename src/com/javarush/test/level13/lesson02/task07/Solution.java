package com.javarush.test.level13.lesson02.task07;

/* Параметризованый интерфейс
В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<T>
    {
        SimpleObject<T> getInstance();
    }

    public static class StringObject<Object> /*I dont understand this one */ implements SimpleObject<String>
    {

        @Override
        public StringObject<String> getInstance()
        {
            return new StringObject<String>();
        }
    }
}
