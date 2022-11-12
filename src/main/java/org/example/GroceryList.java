package org.example;

import java.util.ArrayList;

public class GroceryList {
    ArrayList groceryArrayList = new ArrayList();
    public GroceryList() {

    }

    public void printAllItems() {
        GroceryItem item;
        for (int i = 0; i < groceryArrayList.size(); i++) {
            item = (GroceryItem) groceryArrayList.get(i);
            System.out.println("item " + i + " - " + item.getName() + " price: " + item.getPrice() + " quantity: " + item.getQuantity() + "\n");
        }
        System.out.println("\n");
    }

    public void addItem(double price, String name, int quantity) {
        GroceryItem item = new GroceryItem(price, name, quantity);
        groceryArrayList.add(item);
    }
}
