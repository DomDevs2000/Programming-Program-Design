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
        double width = 10;
        double length = 5;
        double area = rectangleArea(width,length);
        
        System.out.println("the area of a rectangle with width "+ width + "and length " + length + " is area " + area );
        
        double shadedRectangleArea = rectangleArea(7 + 1,4 + 1);
        
        
        System.out.println("Enter a number");
        double userNumber = reader.nextDouble();
        
        
       // int total = 0;
        //while(0.5 || 2 || 0.5 || 1){
            
        //}
        
        double circle[] = {18.4,0.5,3.5,9,10};
        
        for(int i = 0; i < circle.length; i ++){
            double areaArray = circleArea(i);
            System.out.println(areaArray);
        }
        circleArea(userNumber);
      

        
        
        
    }
     public double rectangleArea(double length, double width){
                double areaOfRectangle = length * width;
                return areaOfRectangle;
        }
    public double circleArea(double radius){
        double radiusSquared = radius * radius;
        double pi = Math.PI;
        double area = radiusSquared * pi;
        return area;
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
