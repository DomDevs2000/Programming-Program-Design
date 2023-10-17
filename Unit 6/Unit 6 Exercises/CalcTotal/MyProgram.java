

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    
    
    public static double calcTotal(){
        int quantity = getQuantity(6);
        double price = getPrice(1.25);
        double vatRate = 1.2;
        double totalPrice = price * quantity * 1.2;
        System.out.println(totalPrice);
        return totalPrice;
    }
    
    public static int getQuantity( int quantity){
    return quantity;
}

public static double getPrice( double price){
    return price;
}

public static  double printBill(double price, int quantity, double total){
    double totalPrice = calcTotal();
    System.out.println(totalPrice);
    return totalPrice;
    
}
    
   
   
    
    
        
        
    public static void main(String[] args)
    { 
        calcTotal();
        
       
    }
}
