package org.example.calculator.models;

import java.util.List;

public class BillResponse {
    private static int AUTO_INCREMENT_ID = 1;
    private int id;
    private List<ItemResponse> items;

    public BillResponse(List<ItemResponse> items) {
        this.id = getUniqueId();
        this.items = items;
    }

    private int getUniqueId() {
        return AUTO_INCREMENT_ID++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ItemResponse> getItems() {
        return items;
    }

    public void setItems(List<ItemResponse> items) {
        this.items = items;
    }
}
