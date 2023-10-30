import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    Scanner reader = new Scanner(System.in);
    
    public void runMyProgram()
    {
        //Write your code here
        //Can you change this so target depends on user input?
        int [] numbers = new int[10];
        
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print("Enter number " + i + " : ");
            numbers[i] = reader.nextInt();
        }
        
        System.out.println("The numbers were: ");
        
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("number "+ i + " value is: "+ numbers[i]);
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
