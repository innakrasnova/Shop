package ru.shop.interfaces;

public interface CustomerInterface {

    void addGoodsInBasket(GoodsInterface goods);

    void buy();

    void returnGoods();

    String getName();

}
