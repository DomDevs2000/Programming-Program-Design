import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    Scanner reader = new Scanner(System.in);
    // Write your code here

    public static void runMyProgram() {
        System.out.println("Calculating the area of circles:");
        double[] radiiArray = { 18.4, 0.5, 3.5, 9, 10 };
        for (int i = 0; i < radiiArray.length; i++) {
            double radius = radiiArray[i];
            double area = circleArea(radius);
            System.out.println("Circle with radius " + radius + " cm has an area of " + area);
        }

        System.out.println("Calculating the area of circles with predefined radii:");
        int[] predefinedRadii = { 10, 15, 20, 25, 30 };
        for (int i = 0; i < predefinedRadii.length; i++) {
            int radius = predefinedRadii[i];
            double area = circleArea(radius);
            System.out.println("Circle with radius " + radius + " cm has an area of " + area);
        }
        // double outerRectangleArea = circleArea(7, 4);
        // double innerRectangleArea = circleArea(5, 2); // Subtract 2 meters from both
        // sides
        // double shadedArea = outerRectangleArea - innerRectangleArea;

        // System.out.println("Area of the shaded region in the rectangle is: " +
        // shadedArea + " square meters");
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
