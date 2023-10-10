import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    public void runMyProgram()
    {
        Scanner reader = new Scanner(System.in);
        //Write your code here
        //there is a problem here - add another: reader.nextLine();
        System.out.println("Product ? :");
        String product = reader.nextLine();
        //No problem now
        System.out.println("Quantity ? :");
        int quantity = reader.nextInt();
        System.out.println("Price ? :");
        double price = reader.nextDouble();
        
        System.out.println(quantity + " " + product + " @ "
            + price + " = " + (quantity * price)); 

        
        
        
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
