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
        double length1 = 6.5;
        //Task 1 
        System.out.println("Enter width of the rectangle");
        double width1 = reader.nextDouble();
        double area = length1 * width1;
        System.out.println("Area of rectangle = " + area);
               
        //Task 2 
        double length2 = 0;
        double width2 = 5;
        int count = 0;
        while (count < 4)
        {
            length2 = length2 + 3;
            area = length2 * width2;
            System.out.println("Area is = " + area);
            if (area >= 20)
            {
                System.out.println("Large Rectangle ");
            }
            else
            {
                System.out.println("Small Rectangle ");
            }
            count = count + 1;
        }
        
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
