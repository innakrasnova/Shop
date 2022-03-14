package ru.shop.start;

import ru.shop.model.goods.BaseGoods;
import ru.shop.service.CreateOrderService;
import ru.shop.model.customer.CommonCustomer;
import ru.shop.model.goods.BakeryGoods;
import ru.shop.model.goods.MilkGoods;
import ru.shop.category.BakeryCategory;
import ru.shop.category.MilkCategory;
import ru.shop.service.PutProductService;

public class Start {

            public static void main(String[] args) {
                doShoppingProcess();
            }

            private static void doShoppingProcess() {

                CommonCustomer commonCustomer = new CommonCustomer("Вася", 1000);

                PutProductService.waitProducts(commonCustomer);

                CreateOrderService order = new CreateOrderService();

                System.out.println(commonCustomer.getBasket().getGoods());

                order.calculateSum(commonCustomer.getBasket());
            }
}
