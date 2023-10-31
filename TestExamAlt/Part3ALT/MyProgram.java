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
        System.out.println("0. Quit");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.print("Enter the number of your choice : ");
        int choice = reader.nextInt();
        
        while (choice != 0)
        {
            if (choice == 1)
            {
               System.out.print("Enter radius : ");
               double radius = reader.nextDouble(); 
               double area = circleArea(radius);
               System.out.println("Area = " + area);
            }
            else
            {
               System.out.print("Enter length : ");
               double length = reader.nextDouble();  
               System.out.print("Enter width : ");
               double width = reader.nextDouble();  
               double area = rectangleArea(length, width);
               System.out.println("Area = " + area);
            }
            
            System.out.println("0. Quit");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Rectangle");
            System.out.print("Enter the number of your choice : ");
            choice = reader.nextInt();
        }
        System.out.println("Thank you");
    }
    
    public double rectangleArea(double l, double w)
    {
        double rectArea = l * w;
        return rectArea;
    }
    
    public double circleArea(double rad)
    {
        double circArea = Math.PI * rad * rad;
        return circArea;
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
