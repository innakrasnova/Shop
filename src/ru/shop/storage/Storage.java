package ru.shop.storage;

public class Storage {

    private int amountOfMilk;
    private int amountOfBread;
    private static Storage storage;

    private Storage(int amountOfMilk, int amountOfBread) {
        this.amountOfMilk = amountOfMilk;
        this.amountOfBread = amountOfBread;
    }

    public static Storage getStorage() {
        if (storage == null) {
            return new Storage(10, 100);
        }
        return storage;
    }

    public int getAmountOfMilk() {
        return amountOfMilk;
    }

    public void addAmountOfMilk(int amountOfMilk) {
        this.amountOfMilk += amountOfMilk;
    }

    public int getAmountOfBread() {
        return amountOfBread;
    }

    public void addAmountOfBread(int amountOfBread) {
        this.amountOfBread += amountOfBread;
    }
}
