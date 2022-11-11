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
}
