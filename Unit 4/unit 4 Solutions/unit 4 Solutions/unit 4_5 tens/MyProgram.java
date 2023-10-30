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
        //Can you change this so target depends on user input?
        int count = 0;
        int target = 100;
        while (count <= target)
        {
            if (count%10 == 0)
            {
                System.out.println(count);
            }
            count = count+1;
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
