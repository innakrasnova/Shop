package ru.shop.model;

import ru.shop.interfaces.GoodsInterface;

import java.util.List;
import java.util.Random;

public class Order {
    private final static String DEFAULT_STATUS_ORDER = "created";
    private final Integer number;
    private double sum;
    private List<GoodsInterface> goods;
    private String status;

    public Order() {
        this.number = (new Random()).nextInt(10000);
    }

    public void setGoods(List<GoodsInterface> goods) {
        this.goods = goods;
    }

    public List<GoodsInterface> getGoods() {
        return goods;
    }

    public Integer getNumber() {
        return number;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        if (status == null) {
            return DEFAULT_STATUS_ORDER;
        }
        return status;
    }
}
