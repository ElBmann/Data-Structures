

/**
 * Created by Brecuero on 3/19/2016.
 */
package dataStructures;
public class Item
{
    String sku;
    double itemPrice;
    public Item(String newSku, double newItemPrice)
    {
           sku = newSku;
           itemPrice = newItemPrice;
    }

    public String getSku()
    {
    return sku;
    }
     public void setSku(String newSku)
    {
        sku = newSku;
    }

    public double getItemPrice()
    {
        return itemPrice;
    }

    public void setItemPrice(double newItemPrice)
    {
        itemPrice = newItemPrice;
    }
@Override
    public String toString()
{
return"Sku Product Number: "+ sku+"Item Price: "+itemPrice;
}

    }


