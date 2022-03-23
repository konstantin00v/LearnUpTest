package ru.learnup.maven;


public class Main {
    public static void main(String[] args) {

        Product[] product = new Product[3];

        product[0] = new ProductBuilder().setName("Apple").setCost(23).build();
        product[1] = new ProductBuilder().setName("Banana").setCost(223).build();
        product[2] = new ProductBuilder().setName("Pineapple").setCost(233).build();


        Shop magazin = Shop.getInstance(product);
        Shop store = Shop.getInstance(product);

        System.out.println("Является ли магазин синглтоном: " + (magazin == store));

        //Количество товаров в магазине
        System.out.println(magazin.сount());


    }
}
