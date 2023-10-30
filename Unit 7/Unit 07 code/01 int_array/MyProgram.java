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
        int [] marks = new int[10];
        marks [0] = 23;
        marks [1] = 5;
        marks [2] = 17;
        marks [3] = 0;
        marks [4] = 2;
        marks [5] = 9;
        marks [6] = 10;
        marks [7] = -4;
        marks [8] = 3;
        marks [9] = -8;
        
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println("marks "+ i + " value is: "+ marks[i]);
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
