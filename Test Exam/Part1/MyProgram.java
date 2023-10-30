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
        double length =  6.5;
        System.out.println("Enter The Width");
        double width1 = reader.nextDouble();
        
        double area = length * width1;
        
        System.out.println("The area of the rectangle is " + area);
      
        double length2= 0;
        double width2 = 5;
        
        for(int i = 0; i < 4; i++){
            length2+=3;
            double rectangleArea = length2 * width2;
            if(rectangleArea >= 20) {
            System.out.println("large rectangle");
            } else {
            System.out.println("Small rectangle");
            }
    
            System.out.println("Area of rectangle is"+ rectangleArea);
        }
        
    }

    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
