package ru.shop.model.customer;

import ru.shop.interfaces.CustomerInterface;
import ru.shop.interfaces.GoodsInterface;

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

    @Override
    public String getName() {
        return name;
    }

    public void buy() {
    }

    public void returnGoods() {
    }

    public void addGoodsInBasket(GoodsInterface goods) {
            for (GoodsInterface : basket.getGoods()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество: ");
            goods.setQuantity(sc.nextDouble());
            sc.close();         // спросить
        }
        if (!basket.getGoods().isEmpty()) {
            System.out.println("\nЗаказ создан. Состав заказа: ");
            for (GoodsInterface : basket.getGoods()) {
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
            System.out.println("Вы выбрали самовывоз");
        else
            System.out.println("Вы выбрали доставку курьером");

        //this.setStatus("Заказ оформлен");
    }
    
}
