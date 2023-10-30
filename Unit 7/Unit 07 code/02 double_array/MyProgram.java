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
        double [] prices = new double[10];
        prices [0] = 23.5;
        prices [1] = 5.0;
        prices [2] = 17.25;
        prices [3] = 0.60;
        prices [4] = 2;
        prices [5] = 9;
        prices [6] = 10.33;
        prices [7] = -4.5;
        prices [8] = 3;
        prices [9] = -8.125;
        
        //NOTE: the loop control variable i is always an int
        // because it is a counter ;we count using whole numers
        for (int  i = 0; i < prices.length; i++)
        {
            System.out.println("prices "+ i + " value is: "+ prices[i]);
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
