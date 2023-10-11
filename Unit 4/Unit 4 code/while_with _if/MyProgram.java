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
        //Write your code here
        //Can you change this so target depends on user input?
        int count = 0; //initialise
        int target = 10;

        while (count <= target) //condition
        {
            if (count%2 == 0)  
            {
                System.out.println(count  + " is even ");
            }
            else
            {
                System.out.println(count  + " is odd ");
            }
            count = count + 1;//increment
        }
    }
    
}
