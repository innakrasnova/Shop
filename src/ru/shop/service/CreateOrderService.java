package ru.shop.service;

import ru.shop.interfaces.GoodsInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CreateOrderService {

    private int number;
    private double sum;
    private String status;
    private ArrayList<GoodsInterface> goodsInBasket = new ArrayList<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void calculateSum() {
        client.getGoodsInBasket
        Iterator<GoodsInterface> iterator = goodsInBasket.iterator();
        double sum = 0;
        while (iterator.hasNext()) {
            GoodsInterface good = iterator.next();
            if (good.getPrice() != 0 && good.getQuantity() != 0) {
                sum += good.getPrice() * good.getQuantity();
            }
        }
        System.out.println("\nОбщая сумма заказа: " + sum + " руб.");
    }

    public void chooseDelivery() {
        System.out.println("\nВыберите способ доставки: 1 - самовывоз; 2 - доставка курьером");
        Scanner sc = new Scanner(System.in);
        int delivery = sc.nextInt();
        if (delivery == 1)
            System.out.println("Вы выбрали самовывоз");
        else System.out.println("Вы выбрали доставку курьером");

        this.setStatus("Заказ оформлен");
    }
}


