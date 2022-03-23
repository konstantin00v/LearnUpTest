package ru.learnup.maven;

public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    };

    public String getName() {
        return this.name;
    };

    public int getCost() {
        return this.cost;
    };

    @Override
    public String toString () {
        return this.name + " стоимостью " + this.cost;
    };

}
