package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListApp {
    private GroceryList groceryList = new GroceryList();
    private Scanner scanner = new Scanner(System.in);
    private int userChoice;
    public static void main(String[] args) {
        GroceryListApp app = new GroceryListApp();
        app.startApp();
    }

    public void startApp() {
        System.out.println("Welcome to your Grocery List!\r");

        while(true) {
            userChoice = menu();
            System.out.println("User has chosen:\r" + userChoice);
            switch (userChoice){
                case 1:
                    printAllItems();
                    break;
                case 2:
                    System.out.println("Going to add item!");
                    break;
                default:
                    System.out.println("Hmm, I don't recognize that one..");
                    break;
            }
            if (userChoice == 0) {
                break;
            }
        }

        System.out.println("Thank you for using the Grocery App!\nSee you soon!");
    }

    private void printAllItems() {
        ArrayList groceryArrayList = groceryList.getAllItems();
        System.out.println("Here is you current shopping list:\r " + groceryArrayList);
    }

    private int menu(){
        int userChoice;
        while (true) {
            try {
                System.out.println("What would you like to do?\n" +
                        "1 - Print your grocery list?\n" +
                        "2 - Add an item?\n" +
                        "0 - Exit.\n" +
                        "Enter any selection from 0 - 2\n");
                userChoice = scanner.nextInt();
                return userChoice;
            } catch (Exception userError) {
                System.out.println("Invalid choice. Please try again\n");
                scanner.nextLine();
            }
        }

    }

}