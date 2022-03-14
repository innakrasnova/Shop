package ru.shop.service;

import ru.shop.interfaces.GoodsInterface;
import ru.shop.model.customer.Basket;

import java.util.Iterator;

public class CreateOrderService {

    private int number;
    private double sum;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void calculateSum(Basket basket) {
        Iterator<GoodsInterface> iterator = basket.getGoods().iterator();
        double sum = 0;
        while (iterator.hasNext()) {
            GoodsInterface good = iterator.next();
            if (good.getPrice() != 0 && good.getQuantity() != 0) {
                sum += good.getPrice() * good.getQuantity();
            }
        }
        System.out.println("\nОбщая сумма заказа: " + sum + " руб.");
    }
}


