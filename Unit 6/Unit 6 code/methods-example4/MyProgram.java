import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    // Move outside runMyProgram() to be a global variable
    Scanner reader = new Scanner(System.in);
    
    public void runMyProgram()
    {
        
        //Write your code here
        System.out.println("Celsius to farenheit converter");
        System.out.print("How many temperatures to convert?" );
        int target = reader.nextInt();
        
        int count = 0;
        while(count<target)
        {
            // calling an input function
            int temp = getCelsius();       
            //calling a processing function
            double conv = converter(temp);
            //calling an output procedure
            printResult(conv);
            count = count + 1;
        }
        System.out.println("Thank you ");

    }

    // These are method definitions
    
    /* This method(function) asks for user input and
     * returns the value input
     * This is a typical "input" fundtion
     */
    public int getCelsius()
    {
        System.out.print("Enter temperature in C : " );
        int cel = reader.nextInt();
        return cel;
    }
    
    /* This method (function) converts a Celsius value
     * to a Fahrenheit value.  It takes an int and returns a double
     * This is a typical "processing" function
     */
    public double converter (int celsius)
    {
        double fahrenheit =  celsius * 9/5.0 + 32;
        return fahrenheit;
    }
    
    /* This method (procedure) takes a double and displays it
     * for the user
     * This is a typical "output" procedure
     */
    public void printResult(double fahrResult)
    {
        System.out.println("The value in Fahrenheit is: "+fahrResult);
    }
        
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
