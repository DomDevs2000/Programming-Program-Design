

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
     public static double triangleArea(double height, int base){
         double halfOfBase = base /2;
         double calculateArea = halfOfBase * height;
         System.out.println(calculateArea);
        return calculateArea;
     }
        
    public static void main(String[] args)
    { 
    triangleArea(10,4);
    }
}
