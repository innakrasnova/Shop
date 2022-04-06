package ru.shop.service;

import ru.shop.model.customer.BaseCustomer;
import ru.shop.model.goods.BakeryGoods;
import ru.shop.model.goods.BaseGoods;
import ru.shop.model.goods.MilkGoods;

import java.util.Scanner;

public class PutProductService {

    private static final Scanner sc = new Scanner(System.in);

    public static void waitProduct(BaseCustomer customer, BaseGoods goods){
        System.out.println("Введите количество: ");
        int count = sc.nextInt();
        BaseGoods good = goods.getClass().getTypeName().equals(MilkGoods.class.getTypeName()) ?
                new MilkGoods("Milk", 100,"шт.") : new BakeryGoods("Bread", 50, "шт.");
        good.setQuantity(count);
        customer.getBasket().put(good);
    }

    public static void waitProducts(BaseCustomer customer){
        System.out.println("Формируем корзину: \n exit (для выхода); \n add (добавить товар)");
        while (sc.hasNext()){
            String input = sc.next();
            if ("exit".equals(input)) {
                break;
            } else if ("add".equals(input)) {
                PutProductService.waitProduct(customer, PutProductService.waitCategory());
            }
            System.out.println("Добавим еще продукт? \n exit (для выхода); \n add (добавить товар)");
        }
    }

    public static BaseGoods waitCategory(){
        System.out.println("Выберите категорию: \n 1 - milk; \n 2 - bread");
        String category = sc.next();
        if (category.equals("1")) {
            return new MilkGoods();
        }
        return new BakeryGoods();
    }
}
