

/**
 * Created by Brecuero on 3/19/2016.
 */
package dataStructures;
public class Item
{
    private String item;
    private double itemPrice;
    public Item()
    {
        item= "Computer";
        itemPrice=1500.00;
    }
    Item(String newItem, double newItemPrice)
    {
        item=newItem;
        itemPrice=newItemPrice;
    }
    public String getItem()
    {
    return item;
    }
     public void setItem(String newItem)
    {
        item = newItem;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double newItemPrice)
    {
        itemPrice=newItemPrice;
    }
}

