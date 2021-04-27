package org.example.calculator.models;

import java.util.List;

public class Bill {
	private static int AUTO_INCREMENT_ID = 1;
	private int id;
	private List<Item> items;

	public Bill(List<Item> items) {
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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}

