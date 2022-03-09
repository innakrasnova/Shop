package ru.shop.model.customer;

import ru.shop.interfaces.CustomerInterface;
import ru.shop.interfaces.GoodsInterface;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class BaseCustomer implements CustomerInterface {

    private String name;
    private double moneyOnAccount;
    private final Basket basket;

    public BaseCustomer(String name, double moneyOnAccount) {
        this.name = name;
        this.moneyOnAccount = moneyOnAccount;
        this.basket = new Basket();
    }

    public Basket getBasket() {
        return basket;
    }

    public void buy() {
    }

    public void returnGoods() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void addGoodsInBasket(GoodsInterface goods) {
        basket.put(goods);
    }

    public void createOrder() {
        for (GoodsInterface goods : basket.getGoods()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество: ");
            goods.setQuantity(sc.nextDouble());
        }
        if (!basket.getGoods().isEmpty()) {
            System.out.println("\nЗаказ создан. Состав заказа: ");
            for (GoodsInterface goods : basket.getGoods()) {
                System.out.println(goods.toString());
            }
        } else
            System.out.println("Заказ не создан");
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
