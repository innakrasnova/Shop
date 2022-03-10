package ru.shop.start;

import ru.shop.service.CreateOrderService;
import ru.shop.model.customer.CommonCustomer;
import ru.shop.model.goods.BakeryGoods;
import ru.shop.model.goods.MilkGoods;
import ru.shop.category.BakeryCategory;
import ru.shop.category.MilkCategory;

public class Start {

            public static void main(String[] args) {
                doShoppingProcess();
            }

            private static void doShoppingProcess() {

                BakeryCategory bakeryCategory = new BakeryCategory();
                MilkCategory milkCategory = new MilkCategory();

                BakeryGoods bread = new BakeryGoods("Bread", 50, "шт.");
                MilkGoods milk = new MilkGoods("Milk", 100,"шт.");

                bakeryCategory.addGoods(bread);
                milkCategory.addGoods(milk);

                CommonCustomer commonCustomer = new CommonCustomer("Вася", 1000);

                CreateOrderService order = new CreateOrderService();
                commonCustomer.addGoodsInBasket(bread);
                commonCustomer.addGoodsInBasket(milk);
                commonCustomer.createOrder();

                order.calculateSum();

                order.chooseDelivery();

            }
}
