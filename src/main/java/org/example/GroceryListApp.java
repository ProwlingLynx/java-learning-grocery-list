package org.example;

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
                    groceryList.printAllItems();
                    break;
                case 2:
                    System.out.println("Going to add item!");
                    addGrocery();
                    groceryList.printAllItems();
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

    private void addGrocery() {
        double price = getItemPrice();
        scanner.nextLine();
        String name = getItemName();
        int quantity = getItemQuantity();
        groceryList.addItem(price, name, quantity);
    }

    private double getItemPrice() {
        while (true) {
            try {
                System.out.println("Enter item price: ");
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Please enter an amount 0 or greater.");
                scanner.nextLine();
            }
        }
    }private String getItemName() {
        while (true) {
            try {
                System.out.println("Enter item name: ");
                return scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter a name.");
                scanner.nextLine();
            }
        }
    }private int getItemQuantity() {
        while (true) {
            try {
                System.out.println("Enter item quantity: ");
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter an amount 0 or greater.");
                scanner.nextLine();
            }
        }
    }

}