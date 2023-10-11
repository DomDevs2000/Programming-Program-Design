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
        String totalString = "";  // set to an empty String
        System.out.println("What string? ");
        String text = reader.nextLine();
        System.out.println("How many times? ");
        int target = reader.nextInt();
        
        while (count < target)
        {
            totalString = totalString + text; //running total
            count = count + 1;
        }
        System.out.println("Total is = " + totalString);

    }
}
