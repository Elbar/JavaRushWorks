package com.javarush.test.level14.lesson04.task01;

/* Building и School
1. Расставь правильно наследование между Building(здание) и School(здание школы).
2. Подумай, объект какого класса должны возвращать методы getSchool и getBuilding.
3. Измени null на объект класса Building или School.
*/

import java.nio.Buffer;

public class Solution
{
    public static void main(String[] args)
    {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool()
    {
        return new School();
        //измените null на объект класса Building или School


    }

    public static Building getBuilding()
    {
        return new Building();
        //измените null на объект класса Building или School

    }

    static class School extends Building /*Add your code here*/
    {
        @Override
        public String toString()
        {
            return "School";
        }
    }

    static class Building /*Add your code here*/
    {
        @Override
        public String toString()
        {
            return "Building";
        }
    }
}
