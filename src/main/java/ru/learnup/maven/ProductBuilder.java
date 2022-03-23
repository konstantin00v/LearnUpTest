package ru.learnup.maven;

public class ProductBuilder {
    private String name;
    private int cost;

    public Product build() {
        return new Product(name,cost);
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setCost(int cost) {
        this.cost = cost;
        return this;
    }

}
