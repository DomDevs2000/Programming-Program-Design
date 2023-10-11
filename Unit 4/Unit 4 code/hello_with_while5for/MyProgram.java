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
        //Write your code here
        //Can you change this so target depends on user input?
        
        System.out.println("Enter name");
        String myName = reader.nextLine();
        System.out.println("How many times?");
        int target = reader.nextInt();
        

        for (int count = 0; count < target; count = count + 1)
        {
            System.out.println("Hello " + myName);
            
        }
    }
    
}
