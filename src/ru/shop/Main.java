package ru.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ru.shop.Order;

public class Main {

    public static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите колчисество груш (кг): ");
        double quantity1 = sc.nextDouble();
        System.out.print("Введите колчисество яблок (кг): ");
        double quantity2 = sc.nextDouble();
        System.out.print("Введите колчисество персиков (кг): ");
        double quantity3 = sc.nextDouble();

        Product product1 = new Product("груши", 80, quantity1);
        Product product2 = new Product("яблоки", 100, quantity2);
        Product product3 = new Product("персики", 70, quantity3);

        products.add(product1);
        products.add(product2);
        products.add(product3);

        public double sumOfOrder(getSum);
        }
}