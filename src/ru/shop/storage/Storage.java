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
            return new Storage(10, 10);
        }
        return storage;
    }

    public int getAmountOfMilk() {
        synchronized (this) {
            return amountOfMilk;
        }
    }

    public void addAmountOfMilk(int amountOfMilk) {
        this.amountOfMilk += amountOfMilk;
    }

    public int getAmountOfBread() {
        synchronized (this) {
            return amountOfBread;
        }
    }

    public void addAmountOfBread(int amountOfBread) {
        this.amountOfBread += amountOfBread;
    }

    public void decreaseAmountOfMilk(int amountOfMilk) {
        this.amountOfMilk -= amountOfMilk;
    }

    public void decreaseAmountOfBread(int amountOfBread) {
        this.amountOfBread -= amountOfBread;
    }
}
