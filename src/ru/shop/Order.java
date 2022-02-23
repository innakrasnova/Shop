package ru.shop;

import ru.shop.interfaces.GoodsInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Order {

    private int number;
    private double sum;
    private ArrayList<GoodsInterface> goodsInBasket = new ArrayList<GoodsInterface>();

    public void addGoodsInBasket (GoodsInterface goods){
        goodsInBasket.add(goods);
    }

    public void createOrder(){
        for (GoodsInterface goods : goodsInBasket) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество: ");
            goods.setQuantity(sc.nextDouble());
        }

        System.out.println();
        if (!goodsInBasket.isEmpty()){
            System.out.println("Заказ сфоормирован. Состав заказа: ");
                for (GoodsInterface goods : goodsInBasket) {
                    System.out.println(goods.toString());
                }
            }
        else
            System.out.println("Заказ не сфоормирован");
    }

    public void calculateSum(){
        Iterator<GoodsInterface> iterator = goodsInBasket.iterator();
        double sum=0;
        while (iterator.hasNext()) {
            GoodsInterface good = iterator.next();
            if (good.getPrice() != 0 && good.getQuantity() != 0) {
                sum += good.getPrice() * good.getQuantity();
            }
        }
        System.out.println();
        System.out.println("Общая сумма заказа: " + sum + " руб.");
    }
}

