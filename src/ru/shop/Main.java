package ru.shop;

import java.util.Scanner;

public class Main {

            public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество груш (кг): ");
            double quantity1 = sc.nextDouble();
            System.out.print("Введите колчество яблок (кг): ");
            double quantity2 = sc.nextDouble();
            System.out.print("Введите количество персиков (кг): ");
            double quantity3 = sc.nextDouble();

            Order order = new Order();

            order.addProduct(new Product("груши", 200, quantity1));
            order.addProduct(new Product("яблоки", 100, quantity2));
            order.addProduct(new Product("персики", 300, quantity3));

            order.calculateSum();
            }
}
