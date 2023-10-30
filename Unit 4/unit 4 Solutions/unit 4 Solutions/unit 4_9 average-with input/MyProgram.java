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
        //Write your code here
        Scanner reader = new Scanner(System.in);
        //Can you change this so target depends on user input?
        int count = 0;
        int number;
        int total = 0;
        
        System.out.println("How many numbers ? ");
        int target = reader.nextInt();
        
        while (count < target)
        {
            System.out.println("Enter number" );
            number = reader.nextInt();
            total = total + number;
            count = count+1;
        }
        
        double average = total / (double)target;
        System.out.println("Average is " + average);
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
