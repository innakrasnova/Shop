package ru.shop.service;

import ru.shop.model.Order;
import ru.shop.model.customer.BaseCustomer;

public class PayOrderService extends Thread {

    private final BaseCustomer customer;
    private final int orderNumber;

    public PayOrderService(BaseCustomer customer, int orderNumber) {
        this.customer = customer;
        this.orderNumber = orderNumber;
    }

    public String pay() {
        double balance = customer.getMoneyOnAccount();
        Order order = customer.getOrderByNumber(orderNumber);
        if (order.getSum() > balance) {
            order.setStatus("not_payed");
        } else {
            customer.buy(order.getSum());
            order.setStatus("payed");
        }
        System.out.println(order.getStatus());
        return order.getStatus();
    }

    @Override
    public void run() {
        super.run();
    }


}
