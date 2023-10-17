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
        
        //Write your code here
        System.out.println("How many ?");
        int target = reader.nextInt();
        
        for (int count = 0;count < target; count = count + 1)
        {
            double boiling = getTemperature();
            double conv1 = converter(boiling); //calling a method
            showResult(conv1);

        }
        System.out.println("Thank you");

    }
    
    
    public double getTemperature()
    {
        System.out.println("Enter temp");
        double temp = reader.nextDouble();
        return temp;
    }
    
    public  double  converter(double cel)
    {
       double faren = cel * 9/5 + 32;
       return faren;
    }
    
    public void showResult(double xxx)
    {
        System.out.println("Farenheit = " + xxx);
    }
    
    
        
        
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
