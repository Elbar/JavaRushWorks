package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by fukuro on 2/8/16.
 */
public abstract class DrinkMaker
{
    abstract  void getRightCup();
    abstract void putIngredient();
    abstract void pour();
//
//    В классе DrinkMaker создать и реализовать метод void makeDrink(),
// который готовит напиток в такой последовательности: выбирает чашку, кладет ингредиенты, заливает жидкостью.
//    3. В отдельных файлах создать классы LatteMaker и TeaMaker, которые наследуются от DrinkMaker.
//    4. Распредели следующие фразы между всеми методами в классах LatteMaker и TeaMaker,
//     различные фразы для различных методов.
//    5. Каждый метод должен выводить в консоль свою фразу не пересекаясь с другими методами.

    void makeDrink()
    {
        getRightCup();
        putIngredient();
        pour();


    }
}
