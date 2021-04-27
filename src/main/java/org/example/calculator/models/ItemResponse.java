package org.example.calculator.models;

public class ItemResponse {
    private String item;
    private int basePrice;
    private int finalPrice;

    public ItemResponse(String item, int basePrice, int finalPrice) {
        this.item = item;
        this.basePrice = basePrice;
        this.finalPrice = finalPrice;
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

    public int getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }
}
