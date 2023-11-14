import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    Scanner reader = new Scanner(System.in);
    public void runMyProgram()
    {
        // Write your code here
        System.out.println("Converter");
        
        // call methods and add control structures here
        
        double cel = fahrenheitToCelsius(212);
        System.out.println(cel);
        
        System.out.println("Thank you for using the temperature converter");    
        
        
    }

    // These are method definitions

    /* This method(function) asks for user to input a number and
     * returns the value input
     * This is a typical "input" function
     */
    public double getInputValue()
    {
        System.out.println("Enter value : ");
        double result = reader.nextDouble();
        return result;
    }

    
    /* This method (function) converts Farenheit to Centigrade
     * This is a typical "processing" function
     */
    public double fahrenheitToCelsius(double fahrenheit)
    {
        double celsius = (fahrenheit - 32) *((double)5/9);
        return celsius;
    }

    
    /* This method (function) converts Centigrade to Farenheit
     * This is a typical "processing" function
     */
    

    
    /* This method (procedure) takes an int and displays it
     * for the user
     * This is a typical "output" procedure
     * @param mess is the message you want to send with this result
     * @param res is the result
     */
    public void printResult(String mess, double res)
    {
        System.out.println( mess + res);
    }
        
    /* This method is a common "output" procedure
     * It has no parameters
     */
    public String displayMenu()
    {
        System.out.println("Enter C - farenheit to Celsius, F - Celsius to Farenheit");
        String choice = reader.nextLine();
        return choice;
    }

    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
