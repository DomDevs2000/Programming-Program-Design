import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        //Can you change this so target depends on user input?
        int count = 0;
        int target = 5;
        int total = 0;  // set to 0
        
        while (count < target)
        {
            System.out.println("Enter number ");
            int number= reader.nextInt();
            total = total + number; //running total
            count = count + 1;
        }
        System.out.println("Total is = " + total);

    }
    
}
