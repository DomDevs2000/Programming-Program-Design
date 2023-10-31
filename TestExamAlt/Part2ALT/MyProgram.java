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
                      
        //Part 2
        //Task 4
        double area2 = rectangleArea(length1, width1);
        System.out.println("The area of a rectangle with width = " + width1 + " and length = " + length1 +" is = " + area2);
        
        //Task 5
        double wholeArea = rectangleArea(7,4);
        double centreArea = rectangleArea(5,2);
        double path = wholeArea - centreArea;
        System.out.println("\nArea of path = " + path);  
        
        //Task 7
        System.out.println("\nEnter radius: " ); 
        double radius = reader.nextDouble();
        double area3 = circleArea(radius);
        System.out.println("\nArea of circle = " + area3); 
        
        //Task 8
        System.out.println("\nAreas of some circles");
        count= 0;    // declared earlier
        double radius1 = 10;
        while(count < 5)            //can use a for... loop
        {
            double area4 = circleArea(radius1);
            System.out.println("Area of circle = " + area4); 
            radius1 = radius1 + 5;
            count = count +1;
        }
        
        //Task 9
        double[] circles = { 18.4, 0.5, 3.5, 9,10};
        
        //Task 10
        System.out.println("\n\nAreas of circles in the array");
        for(int index= 0;index < 5; index++)   // can be while loop
        {
            double area5 = circleArea(circles[index]);
            System.out.println("\nArea of circle = " + area5); 
        }
        
    }
    
    //Task 3
    public double rectangleArea(double l, double w)
    {
        double rectArea = l * w;
        return rectArea;
    }
    
    //Task 6
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
