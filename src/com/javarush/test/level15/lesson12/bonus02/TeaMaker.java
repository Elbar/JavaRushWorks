package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by fukuro on 2/8/16.
 */
public class TeaMaker extends DrinkMaker
{
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour() {
        System.out.println("Заливаем водой");

    }
}
