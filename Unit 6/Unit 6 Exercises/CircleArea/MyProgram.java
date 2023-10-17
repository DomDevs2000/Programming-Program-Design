

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    

    
    public static void circleArea(double diameter)
    {
        double radius = getRadius(10);
        double pi = Math.PI;
        double radiusSquared = radius * radius;
        double areaOfCircle = radiusSquared  * pi;
        System.out.println(areaOfCircle);
        
    }
    
    public static double getRadius(double diameter){
        double radius = diameter / 2 ;
        return radius;
    }
    
    
    
        
        
    public static void main(String[] args)
    { 
    
        circleArea(10);
    }
}
