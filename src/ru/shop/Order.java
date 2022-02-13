package ru.shop;

import java.util.Iterator;
import java.util.List;

public class Order {

    private int number;
    private double sum;
    private List<Product> products;

    /*public Order(int number, double sum) {
        this.number = number;
        this.sum = sum;
        }
    */

    public void addProduct(Product product){
        products.add(product);
    }

    public void calculateSum(){
        Iterator<Product> iterator = products.iterator();
        double sum=0;
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getPrice() != 0 && product.getQuantity() != 0) {
                sum += product.getPrice() * product.getQuantity();
            }
        }
        System.out.println();
        System.out.println("Общая сумма заказа: " + sum + " руб.");
    }
}