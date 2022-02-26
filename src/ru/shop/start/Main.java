package ru.shop.start;

import ru.shop.Order;
import ru.shop.Salesroom;
import ru.shop.customer.CommonCustomer;
import ru.shop.goods.BakeryGoods;
import ru.shop.goods.MilkGoods;
import ru.shop.interfaces.GoodsInterface;
import ru.shop.section.BakerySection;
import ru.shop.section.MilkSection;
import ru.shop.staff.SellerOfBakerySection;
import ru.shop.staff.SellerOfMilkSection;

import java.util.ArrayList;

public class Main {

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

                Order order = new Order();
                order.addGoodsInBasket(bread);
                order.addGoodsInBasket(milk);
                order.createOrder();

                order.calculateSum();

                order.chooseDelivery();

                order.getStatus();



            }
}
