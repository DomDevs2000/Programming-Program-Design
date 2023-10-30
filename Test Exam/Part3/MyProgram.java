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
        int target = 1;
        while(target <=1) {
        
        System.out.println("0. quit \n1. area of circle \n2.Area of Rectangle");
        int userNumber = reader.nextInt();
        
            if (userNumber == 1){
                System.out.println("Enter a radius");
                double userRadius = reader.nextDouble();
                double circleArea = circleArea(userRadius);
                System.out.println( circleArea);
                
            }else if(userNumber == 2){
                System.out.println("Enter a Length");
                double userLength = reader.nextDouble();
                System.out.println("Enter a Width");
                double userWidth = reader.nextDouble();
                double rectangleArea = rectangleArea(userLength, userWidth);
                System.out.println( rectangleArea);
                
            }  else if(userNumber == 0) {
                System.out.println("Thanks for playing");
                target = 2; // breaks loop 
            }

            else {
                System.out.println("Please Enter a valid number");
            }
            System.out.println("do you want to continue : 1 for yes, 2 for no");
            int userContinue = reader.nextInt();
    
            if(userContinue == 1){
                target = 1;
            }
            else if (userContinue == 2){
                System.out.println("thanks for playing");
                target = 2;
                
            } else {
                System.out.println("please enter y or n");
                target = 1;
            }
         
        }
    }

    public double circleArea(double radius){
        double radiusSquared = radius * radius;
        double area = Math.PI * radiusSquared;
        return area;
    }

    public double rectangleArea(double width, double length){
        double area = width * length;
        return area;
    }

    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
