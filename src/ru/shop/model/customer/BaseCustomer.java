package ru.shop.model.customer;

import ru.shop.interfaces.CustomerInterface;
import ru.shop.model.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class BaseCustomer implements CustomerInterface {

    private String name;
    private double moneyOnAccount;
    private final Basket basket;
    private Map<Integer, Order> orders;

    public BaseCustomer(String name, double moneyOnAccount) {
        this.name = name;
        this.moneyOnAccount = moneyOnAccount;
        this.basket = new Basket();
        this.orders = new HashMap<>();
    }

    public Basket getBasket() {
        return basket;
    }

    @Override
    public String getName() {
        return name;
    }

    public void addOrder(Order order) {
        orders.put(order.getNumber(), order);
    }

    public Order getOrderByNumber(Integer number) {
        return orders.get(number);
    }

    public double getMoneyOnAccount() {
        return moneyOnAccount;
    }

    public void buy(double sum) {
        moneyOnAccount -= sum;
    }

    public void returnGoods() {
    }


    public void chooseDelivery() {                                      // в какой класс переместить
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
