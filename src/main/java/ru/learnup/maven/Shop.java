package ru.learnup.maven;


public class Shop {
    private Product[] products;
    private static Shop instance;

    public static synchronized Shop getInstance(Product[] products) {
        if ( instance == null ) {
            instance = new Shop(products);
        }
        return instance;
    };

    private Shop(Product[] product) {
        this.products = product;
    };

    public int сount() {
        System.out.println("Количество товаров:");
        return products.length;
    };


}
