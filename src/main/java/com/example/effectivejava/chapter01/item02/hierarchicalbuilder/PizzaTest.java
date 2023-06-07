package com.example.effectivejava.chapter01.item02.hierarchicalbuilder;

import static com.example.effectivejava.chapter01.item02.hierarchicalbuilder.NyPizza.Size.SMALL;
import static com.example.effectivejava.chapter01.item02.hierarchicalbuilder.Pizza.Topping.*;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION).build();

        Calzone build = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();
    }
}
