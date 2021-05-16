package com.dmitrydunay;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {

    private final List<Fruit> fruits = new ArrayList<>();

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public double calculateBill() {
        double result = 0;
        for (Fruit fruit : fruits) {
            result += fruit.getPricePerKg() * fruit.getWeight() / 1000.0;
        }
        return result;
    }
}