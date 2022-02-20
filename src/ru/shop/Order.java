package ru.shop;

import ru.shop.goods.AbstractGoods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order {

    private int number;
    private double sum;
    private List <AbstractGoods> products = new ArrayList<>();

    public void addProduct(AbstractGoods product){
        products.add(product);
    }

    public void calculateSum(){
        Iterator<AbstractGoods> iterator = products.iterator();
        double sum=0;
        while (iterator.hasNext()) {
            AbstractGoods product = iterator.next();
            if (product.getPrice() != 0 && product.getQuantity() != 0) {
                sum += product.getPrice() * product.getQuantity();
            }
        }
        System.out.println();
        System.out.println("Общая сумма заказа: " + sum + " руб.");
    }
}