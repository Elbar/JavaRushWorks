package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        String middleName;
        String lastName;
        int height;
        int weight;

        public  Human(String name, int age)
        {
            this.name = name;
            this.age = age;

        }

        public Human(String name, String middleName, String lastName)
        {
            this.name = name;
            this.middleName = middleName;
            this.lastName = lastName;
        }

        public Human(String name)
        {
            this.name = name;
        }

        public Human(int age, int height, int weight)
        {
            this.age = age;
            this.height = height;
            this.weight = weight;

        }

        public Human(String name, int age, int height)
        {
            this.name = name;
            this.age = age;
            this.height = height;
        }

        public Human(int age)
        {
            this.age = age;
        }

        public Human(int height, int weight)
        {
            this.height = height;
            this.weight = weight;
        }

       public Human(String name, String middleName, String lastName, int age, int height, int weight)
       {
           this.name = name;
           this.middleName = middleName;
           this.lastName = lastName;
           this.age = age;
           this.height = height;
           this.weight = weight;
       }

        public Human(String middleName, String lastName)
        {
            this.middleName = middleName;
            this.lastName = lastName;
        }

        public Human(String name,String middleName, int height, int weight)
        {
            this.name = name;
            this.middleName = middleName;
            this.height = height;
            this.weight = weight;
        }


        //напишите тут ваши переменные и конструкторы
    }
}
