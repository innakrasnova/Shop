package ru.shop.interfaces;

public interface GoodsInterface {

    String getName();

    double getPrice();

    double getQuantity();

    void setQuantity(double quantity);

    CategoryInterface getSection();

    void setSection(CategoryInterface section);

    String toString();
}
