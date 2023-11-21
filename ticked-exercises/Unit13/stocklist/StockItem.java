
/**
 * Write a description of class stockItem here.
 * 
 * This version is a soluiton to Practical 04, incorporating solutions to Task 2 and 9
 * @author A.Marczyk 
 * @version 8.10.2004
 */
public class StockItem
{
    private String description;
    private int quantity;
    private int price;
    private boolean onOrder;
    
    public StockItem(String desc, int pr)
    {
        description = desc;
        quantity = 0;
        price = pr;
        onOrder = false;
    }
    
    public void setPrice(int pr)
    {
        price = pr;
    }
    
    public void setOnOrder()
    {
        onOrder = true;
    }
    
    public void doDelivery(int amount)
    {
        quantity = quantity + amount;
        onOrder = false;
    }
    
    public void doSale(int amount)
    {
        if ((quantity - amount) >= 0)
        {
            quantity = quantity - amount;
        }
    }
    
    public boolean orderMore()
    {
        if (quantity <= 5)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        // BUT this is neater
        //      return quantity <= 5;
     }
    
    
    public int getPrice()
    {
        return price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }  
    
    public void printStockReport()
    {
        System.out.println("******************************");
        System.out.println("*  Current Stock Report");
        System.out.println("*  Report on item: " + description + " priced at " + price + "p");
        System.out.println("*");
        System.out.println("*  Current stock level : " + quantity);
        System.out.println("******************************");
        System.out.println("Thank - you");
    }
    
    //Method added in Practical 07
    public String toString()
    {
        String s = description + " priced at " + price + "p" + "\nCurrent stock level : " 
                         + quantity + "\n******************************";                        
        return s;
    }
}
