import java.util.*;
/**
 * Write a description of class StockList here.
 * 
 * @author A.Marczyk 
 * @version 23/11/04
 */
public class StockList
{
    private ArrayList<StockItem> stock; 

    public StockList()
    {
        stock = new ArrayList<StockItem>();
    }
    
    public void addNewStockItem(String desc, int pr)
    {
        StockItem temp = new StockItem(desc,pr);
        stock.add(temp);
    }
    
    public int noOfStockItems()
    {
        return stock.size();
    }
    
    public void showItem(int index)
    {
        if(index >= 0 && index <stock.size())
        {
            StockItem temp = stock.get(index);
            if (temp != null)
            {
                System. out.println(temp.toString());
            }
        }
    }
    
    public void removeItem(int index)
    {
        if(index >= 0 && index <stock.size())
        {
            StockItem temp = stock.get(index);
            if (temp != null)
            {
                stock.remove(index);
            }
        }
    }
    
    
    public void updateStockLevel(int index, int amount)
    {
        if(index >= 0 && index <stock.size())
        {
            StockItem temp = stock.get(index);
            if (temp != null)
            {
                temp.doDelivery(amount);
            }
        }
    }
    
    
    
    
}
