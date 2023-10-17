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
        Scanner reader = new Scanner(System.in);
        //Write your code here
        int boiling = 100;
        int middling = 22;
        int cold = -15;
        // What else should you test?
        // Is there a problem with the calculation ???
        
        // Note the code repetition
        double conv1 = boiling * 9/5 + 32;
        System.out.println(conv1);
        
        double conv2 = middling * 9/5 + 32;
        System.out.println(conv2);
        
        double conv3 = cold * 9/5 + 32;
        System.out.println(conv3);
    }
        
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
