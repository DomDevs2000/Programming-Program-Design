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
        
        // below:  converter(temp1) is a method CALL
        double conv1 = converter (boiling);
        System.out.println(conv1);
        
        // which of the code below shows method CALL ?
        double conv2 = converter (middling);
        System.out.println(conv2);
        
        double conv3 = converter (cold);
        System.out.println(conv3);
    }
        
    /* this is a method (function) that converts a Celsius value
     * to a Fahrenheit value.  It takes an int and returns a double
     * This is a method DEFINITION
     */
    public double converter (int celsius)
    {
        double fahrenheit =  celsius * 9/5.0 + 32;
        return fahrenheit;
    }
        
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
