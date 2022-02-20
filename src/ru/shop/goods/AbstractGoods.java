package ru.shop.goods;

public class AbstractGoods {

    private String name;
    private double price;
    private double quantity;
    private String unit;
    private boolean defect;

    public AbstractGoods(String name, double price, double quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public boolean isDefect() {
        return defect;
    }

    public void setDefect(boolean defect) {
        this.defect = defect;
    }
}
