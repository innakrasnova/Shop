package ru.shop.start;

import ru.shop.service.CreateOrderService;
import ru.shop.Salesroom;
import ru.shop.model.customer.CommonCustomer;
import ru.shop.model.goods.BakeryGoods;
import ru.shop.model.goods.MilkGoods;
import ru.shop.section.BakerySection;
import ru.shop.section.MilkSection;
import ru.shop.staff.SellerOfBakerySection;
import ru.shop.staff.SellerOfMilkSection;

public class Start {

            public static void main(String[] args) {
                doShoppingProcess();
            }

            private static void doShoppingProcess() {

                Salesroom salesroom = new Salesroom();
                BakerySection bakerySection = new BakerySection();
                MilkSection milkSection = new MilkSection();

                salesroom.addSection(bakerySection);
                salesroom.addSection(milkSection);

                SellerOfBakerySection sellerOfBakerySection = new SellerOfBakerySection("Анна", bakerySection);
                SellerOfMilkSection sellerOfMilkSection = new SellerOfMilkSection("Ольга", milkSection);

                bakerySection.addStaff(sellerOfBakerySection);
                milkSection.addStaff(sellerOfMilkSection);

                BakeryGoods bread = new BakeryGoods("Bread", 50, "шт.");
                MilkGoods milk = new MilkGoods("Milk", 100,"шт.");

                bakerySection.addGoods(bread);
                milkSection.addGoods(milk);

                CommonCustomer commonCustomer = new CommonCustomer("Вася", 1000);
                //SpecialCustomer specialCustomer = new SpecialCustomer("Петя", 2000);

                CreateOrderService order = new CreateOrderService();
                commonCustomer.addGoodsInBasket(bread);
                commonCustomer.addGoodsInBasket(milk);
                commonCustomer.createOrder();

                order.calculateSum();

                order.chooseDelivery();

            }
}
