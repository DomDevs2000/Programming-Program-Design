import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    Scanner reader = new Scanner(System.in);

    public void runMyProgram() {

        // Write your code here
        System.out.println("Calculator");
        System.out.println("please choose an option");
        printMenu();
        int userOption = reader.nextInt();
        System.out.println("please choose a first number");
        int num1 = getNumber();
        System.out.println("please choose a second number");
        int num2 = getNumber();
        if (userOption == 1) {
            int answer = add(num1, num2);
            printResult(answer);
        } else if (userOption == 2) {
            int answer = subtract(num1, num2);
            printResult(answer);

        } else {
            System.out.println("Thank you");

        }

    }

    // These are method definitions
    /*
     * This method(function) asks for user to input a number and
     * returns the value input
     * This is a typical "input" fundtion
     */
    public int getNumber() {

        System.out.println("Enter number");
        int number = reader.nextInt();
        return number;
    }

    /*
     * This method (function) adds two numbers
     * This is a typical "processing" function
     */
    public int add(int x, int y) {
        int z = x + y;
        return z;
    }

    public int subtract(int x, int y) {
        int z = x - y;
        return z;
    }

    /*
     * This method (procedure) takes an int and displays it
     * for the user
     * This is a typical "output" procedure
     */
    public void printResult(int ans) {
        System.out.println("The result for your two numbers is: " + ans);
    }

    public void printMenu() {
        System.out.println("""

                1.add
                2. Subtract
                """);
    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
