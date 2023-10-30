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
        System.out.println("Enter target value");
        int target = reader.nextInt();
        int total = 0; 
        while (count < target)
        {
            count = count + 1;
            if ( count%2 == 1)
            {
               System.out.println(count);
            }
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
