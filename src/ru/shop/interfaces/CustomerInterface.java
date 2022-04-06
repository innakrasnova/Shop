package ru.shop.interfaces;

public interface CustomerInterface {

    void addGoodsInBasket(GoodsInterface goods);

    void buy(double sum);

    void returnGoods();

    String getName();

}
