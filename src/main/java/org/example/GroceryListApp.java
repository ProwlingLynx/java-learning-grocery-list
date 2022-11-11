package org.example;

import java.util.ArrayList;

public class GroceryListApp {
    private GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        GroceryListApp app = new GroceryListApp();
        app.startApp();
    }

    public void startApp() {
        System.out.println("Welcome to your Grocery List!\r");

        while(true) {
            printAllItems();
            break;
        }
    }

    private void printAllItems() {
        ArrayList groceryArrayList = groceryList.getAllItems();
        System.out.println("Here is you current shopping list:\r " + groceryArrayList);
    }

}