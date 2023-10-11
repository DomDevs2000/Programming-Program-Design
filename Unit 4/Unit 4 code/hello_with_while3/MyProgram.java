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
        int count = 0; 
        System.out.println("How many times?");
        int target = reader.nextInt();

        while (count < target)
        {
            System.out.println(count + "Hello World!");
            count = count + 1;
        }
    }
    
}
