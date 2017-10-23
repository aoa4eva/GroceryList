package me.aoa4eva;

import me.aoa4eva.GroceryItem;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<GroceryItem> groceryItems;

    public ShoppingCart()
    {
        groceryItems = new ArrayList<GroceryItem>();

    }

    public void addGroceryItem(GroceryItem toAdd)
    {
        this.groceryItems.add(toAdd);
    }

    public double getTotal()
    {
        double totalPrice = 0;
        for(GroceryItem g: groceryItems)
        {
            totalPrice+=g.getPrice();
        }

        return totalPrice;
    }

    public String displayItems()
    {
        String toDisplay="";

        for(GroceryItem g: groceryItems)
        {
            toDisplay+=g.getName()+"                "+g.getPrice()+"\n";
        }

        return toDisplay;

    }
}
