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
        // Note: there are better ways to do this in Java
        char [] name = new char[6];
        name[0] = 'O';
        name[1] ='l';
        name[2] ='e';
        name[3] = 'n';
        name[4] = 'k';
        name[5] ='a';
        
        for (int i = 0; i <name.length; i++)
        {
            System.out.print(name[i]); // NOTE: the use of print rather than println
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
