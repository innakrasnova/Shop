package ru.shop.start;

import ru.shop.model.Order;
import ru.shop.model.goods.BaseGoods;
import ru.shop.service.CreateOrderService;
import ru.shop.model.customer.CommonCustomer;
import ru.shop.model.goods.BakeryGoods;
import ru.shop.model.goods.MilkGoods;
import ru.shop.category.BakeryCategory;
import ru.shop.category.MilkCategory;
import ru.shop.service.PayOrderService;
import ru.shop.service.PutProductService;
import ru.shop.service.StorageControllerService;
import ru.shop.storage.Storage;

public class Start {

    public static void main(String[] args) {
    doShoppingProcess();
    }

    private static void doShoppingProcess() {

        Storage storage = Storage.getStorage();

        CommonCustomer commonCustomer = new CommonCustomer("Вася", 1000);
        CreateOrderService orderService = new CreateOrderService();

        StorageControllerService storageControllerService = new StorageControllerService(storage);
        PutProductService.waitProducts(commonCustomer);

        Order order = orderService.buildOrder(commonCustomer);

        commonCustomer.addOrder(order);

        PayOrderService payOrderService = new PayOrderService(commonCustomer, order.getNumber());

        payOrderService.start();

        storageControllerService.setOrder(order);

        Thread storageThread = new Thread(storageControllerService);

        storageThread.start();

        }
}
