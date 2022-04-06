package ru.shop.interfaces;

public interface GoodsInterface {

    String getName();

    double getPrice();

    int getQuantity();

    void setQuantity(int quantity);

    CategoryInterface getSection();

    void setSection(CategoryInterface section);

    String toString();

}
