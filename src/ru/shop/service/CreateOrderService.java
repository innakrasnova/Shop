package ru.shop.service;

import ru.shop.interfaces.GoodsInterface;
import ru.shop.model.Order;
import ru.shop.model.customer.BaseCustomer;
import ru.shop.model.customer.Basket;

import java.util.Iterator;

public class CreateOrderService {

    public Order buildOrder(BaseCustomer customer) {
        Order order =  new Order();
        order.setSum(calculateSum(customer.getBasket()));
        order.setGoods(customer.getBasket().getGoods());
        return order;
    }

    private double calculateSum(Basket basket) {
        Iterator<GoodsInterface> iterator = basket.getGoods().iterator();
        double sum = 0;
        while (iterator.hasNext()) {
            GoodsInterface good = iterator.next();
            if (good.getPrice() != 0 && good.getQuantity() != 0) {
                sum += good.getPrice() * good.getQuantity();
            }
        }
        return sum;
    }
}


