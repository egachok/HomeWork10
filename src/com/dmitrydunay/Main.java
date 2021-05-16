package com.dmitrydunay;

public class Main {

    public static void main(String[] args) {

        ShopAssistant shopAssistant = new ShopAssistant();
        shopAssistant.addFruit(new Fruit(FruitType.APPLE, Color.GREEN, 346, 21.95));
        shopAssistant.addFruit(new Fruit(FruitType.APPLE, Color.RED, 230, 19.95));
        shopAssistant.addFruit(new Fruit(FruitType.BANANA, Color.YELLOW, 220, 32.85));
        shopAssistant.addFruit(new Fruit(FruitType.LEMON, Color.YELLOW, 88, 34.95));

        double result = shopAssistant.calculateBill();
        System.out.printf("Your bill is: %.2f", result);
    }
}