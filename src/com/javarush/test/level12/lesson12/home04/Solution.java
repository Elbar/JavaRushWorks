package com.javarush.test.level12.lesson12.home04;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «хз»
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «хз».
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o)
    {
//        String temp;
//        if (o instanceof Cat) {temp = "Кот"; }
//        if (o instanceof Tiger) {temp = "Тигр"; }
//        if (o instanceof Lion) { temp = "Лев";}
//        if (o instanceof Bull) {temp = "Бык"; }
//        if (o instanceof Pig) {temp = "хз";}
//
//        return temp;

        String res;
        if (o instanceof Cat) res = "Кот";
        else if (o instanceof Tiger) res = "Тигр";
        else if (o instanceof Lion) res = "Лев";
        else if (o instanceof Bull) res = "Бык";
        else res = "хз";

        return res;

    }

    public static class Cat
    {
    }

    public static class Tiger
    {
    }

    public static class Lion
    {
    }

    public static class Bull
    {
    }

    public static class Pig
    {
    }
}
