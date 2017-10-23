package me.aoa4eva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Create an array list of strings to store the grocery list
        * */
	    String entered="y";
        String item="";
        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.print("Enter an item to add to your grocery list:");
            item = keyboard.nextLine();

            System.out.print("Do you want to continue?");
            entered = keyboard.nextLine();

        }while(entered.equalsIgnoreCase("y")||!entered.equalsIgnoreCase("n"));
    }
}
