package ru.shop.model.customer;

import ru.shop.interfaces.GoodsInterface;

import java.util.LinkedList;

public class Basket {

    private final LinkedList<GoodsInterface> goods;

    public Basket() {
        this.goods = new LinkedList<>();
    }

    public void put(GoodsInterface goods) {
        this.goods.add(goods);
    }

    public void remove(GoodsInterface goods) {
        this.goods.remove(goods);
    }

    public LinkedList<GoodsInterface> getGoods() {
        return goods;
    }
}

