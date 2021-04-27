package org.example.calculator.models;

public class Item {
    private String item;
    private int basePrice;
    private int discount;

    public Item(String item, int basePrice, int discount) {
        this.item = item;
        this.basePrice = basePrice;
        this.discount = discount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
