package ru.shop;

import java.util.Iterator;

import static ru.shop.Main.products;

public class Order {

    private double sum;

    public double getSum() {
        return sum;
    }
    public double sumOfOrder() {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            sum = product.getPrice() * product.getQuantity();
        }
        return sum;
    }
}