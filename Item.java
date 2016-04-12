/**
 * Brian Recuero
 * The item Class written in java
 * Consists of a DEFAULT VALUE Getters and Setters
 * for the toString method in the main class.
 */

package dataStructures;
public class Item
{
    String sku;
    double itemPrice;
    public Item()//..........................................Default Constructor
    {
        sku = "10.00";
        itemPrice = 100.00;
    }
    Item(String newSku, double newItemPrice)//...............Giving Item, Item Types
    {
        sku = newSku;
        itemPrice = newItemPrice;
    }

    public String getSku()//.................................Get Method
    {
        return sku;
    }
    public void setSku(String newSku)
    {
        sku = newSku;
    }

    public double getItemPrice()//............................Get Method
    {
        return itemPrice;
    }

    public void setItemPrice(double newItemPrice)//...........Set method
    {
        itemPrice = newItemPrice;
    }
@Override
    public String toString()//.................................To String
{
return"\n Sku Product Number: "+ sku+"\n Item Price: "+itemPrice;
}

}//End App Class
