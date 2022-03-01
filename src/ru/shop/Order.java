package ru.shop;

import ru.shop.interfaces.GoodsInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Order {

    private int number;
    private double sum;
    private String status;
    private ArrayList<GoodsInterface> goodsInBasket = new ArrayList<GoodsInterface>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addGoodsInBasket(GoodsInterface goods) {
        goodsInBasket.add(goods);
    }

    public void createOrder() {
        for (GoodsInterface goods : goodsInBasket) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество: ");
            goods.setQuantity(sc.nextDouble());
        }
        if (!goodsInBasket.isEmpty()) {
            System.out.println("\nЗаказ создан. Состав заказа: ");
            for (GoodsInterface goods : goodsInBasket) {
                System.out.println(goods.toString());
            }
        } else
            System.out.println("Заказ не создан");
    }

    public void calculateSum() {
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
            System.out.println("Вы выбрали самовыоз");
        else
            System.out.println("Вы выбрали доставку курьером");

        this.setStatus("Заказ оформлен");
    }
}


