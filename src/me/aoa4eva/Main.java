package me.aoa4eva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Create an array list of strings to store the grocery list
        * */
	    String entered="y";
        String item="";
        double price=0;
        Scanner keyboard = new Scanner(System.in);

        ShoppingCart thisCart = new ShoppingCart();

        do{
            System.out.print("Enter an item to add to your grocery list:");
            item = keyboard.nextLine();

            System.out.print("Enter a price for your grocery item:");
            price = keyboard.nextDouble();
            keyboard.nextLine();

            GroceryItem thisItem = new GroceryItem(item,price);
            thisCart.addGroceryItem(thisItem);

            System.out.print("Do you want to continue?");
            entered = keyboard.nextLine();

        }while(entered.equalsIgnoreCase("y")||!entered.equalsIgnoreCase("n"));



        System.out.println(thisCart.displayItems());
        System.out.println("The total price is: "+thisCart.getTotal());

    }
}
