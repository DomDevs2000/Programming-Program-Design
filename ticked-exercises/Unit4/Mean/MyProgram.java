import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {
        Scanner reader = new Scanner(System.in);
        // Write your code here
        System.out.println("choose the first number");
        int firstNumber = reader.nextInt();
        System.out.println("choose the second number");
        int secondNumber = reader.nextInt();
        System.out.println("choose the third number");
        int thirdNumber = reader.nextInt();

        int total = firstNumber + secondNumber + thirdNumber;
        int mean = total / 3;

        System.out.println("The mean of your numbers is: " + mean);
    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
