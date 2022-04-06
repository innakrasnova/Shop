package ru.shop.service;

import ru.shop.interfaces.GoodsInterface;
import ru.shop.model.Order;
import ru.shop.model.goods.BakeryGoods;
import ru.shop.model.goods.MilkGoods;
import ru.shop.storage.Storage;

public class StorageControllerService implements Runnable {

    private Storage storage;
    private Order order;

    public StorageControllerService(Storage storage) {
        this.storage = storage;
    }

    private void changeStorage() {
        for (GoodsInterface goods : order.getGoods()) {
            if (!order.getGoods().isEmpty()) {
                if (goods.getClass().getTypeName().equals(MilkGoods.class.getTypeName())) {
                    storage.decreaseAmountOfMilk(goods.getQuantity());
                }
                if (goods.getClass().getTypeName().equals(BakeryGoods.class.getTypeName())) {
                    storage.decreaseAmountOfBread(goods.getQuantity());
                }
            }
        }
    }

    public StorageControllerService setOrder(Order order) {
        this.order = order;
        return this;
    }

    @Override
    public void run() {
        changeStorage();
    }
}