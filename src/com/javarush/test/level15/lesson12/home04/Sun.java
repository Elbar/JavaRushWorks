package com.javarush.test.level15.lesson12.home04;

/**
 * Created by fukuro on 2/8/16.
 */
public class Sun implements Planet
{
    private static Sun ourInstance = new Sun();

    public static Sun getInstance()
    {
        return ourInstance;
    }

    private Sun()
    {
    }
}
