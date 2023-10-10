
/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class MyProgram
{
    public void runMyProgram()
    {
        Scanner input = new Scanner(System.in);
        //Write your code here
        int max = 20;
        double current;
        System.out.println("Enter current temperature");
        current = input.nextDouble();
        
        if (current > max)
        {
            System.out.println("House is warm: heating switches off");
            
            
        }
        else  
        {
            System.out.println("Heating on");
        }
        System.out.println("Thank you");
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
