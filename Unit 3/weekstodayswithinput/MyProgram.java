import java.util.*;
/**
 * /* Program to convert weeks into days
 * Uses the conversion formula:  1 week = 7 days    
 */
public class MyProgram
{
    public void runMyProgram()
    {
        Scanner reader = new Scanner(System.in);       
        int weeks ;         // declare 
        System.out.println("Enter number of weeks");
        weeks = reader.nextInt();
        int days =  weeks * 7;  // declare and perform conversion 
        System.out.println(days); 
        //Alternative output
        System.out.println(weeks + " weeks is " + days + " days");
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
