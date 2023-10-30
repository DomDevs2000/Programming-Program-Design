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
        int count = 1;
        int target = 12;
        int total = 0; 
        while (count <= target)
        {
            total = count * 5;
            System.out.println(count + " * 5 = " + total);
            count= count + 1;
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
