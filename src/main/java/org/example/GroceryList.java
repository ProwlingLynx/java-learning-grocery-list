package org.example;

import java.util.ArrayList;

public class GroceryList {
    ArrayList groceryArrayList = new ArrayList();
    public GroceryList() {

    }

    public ArrayList getAllItems() {
        groceryArrayList.add("apples");
        return groceryArrayList;
    }

    public GroceryItem addItem(double price, String name, int quantity) {
        GroceryItem item = new GroceryItem(price, name, quantity);
        groceryArrayList.add(item);
        return item;
    }
}
