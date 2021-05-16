package com.dmitrydunay;

public class Fruit {

    private FruitType type;
    private Color color;
    private int weight;
    private double pricePerKg;

    public Fruit(FruitType type, Color color, int weight, double pricePerKg) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public FruitType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", color=" + color +
                ", weight=" + weight +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}