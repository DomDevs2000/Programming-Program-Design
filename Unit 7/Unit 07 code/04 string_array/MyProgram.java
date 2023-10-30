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
        char [] letters = new char[6];
        letters [0] = 'O';
        letters[1] ='l';
        letters[2] ='e';
        letters[3] = 'n';
        letters[4] = 'k';
        letters[5] ='a';
        
        for (int i = 0; i <letters.length; i++)
        {
            System.out.print(letters[i]);
        }
        System.out.println();
        
        //We don't need to use char[] - we can use String
        String letters2 = "Olenka2";
        System.out.println(letters2);
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
