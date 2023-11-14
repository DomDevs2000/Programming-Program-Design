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
        int userOption = 0;

        while (userOption != 5) {
            System.out.println("Calculator");
            System.out.println("Please choose an option:");
            printMenu();

            userOption = reader.nextInt();

            if (userOption >= 1 && userOption <= 4) {
                System.out.println("Please choose a first number:");
                int num1 = getNumber();

                System.out.println("Please choose a second number:");
                int num2 = getNumber();

                int answer = 0;

                switch (userOption) {
                    case 1:
                        answer = add(num1, num2);
                        break;
                    case 2:
                        answer = subtract(num1, num2);
                        break;
                    case 3:
                        answer = multiply(num1, num2);
                        break;
                    case 4:
                        answer = divide(num1,num2);

                    default:
                        break;
                }

                printResult(answer);
            } else if (userOption == 5) {
                System.out.println("Thank you for using the calculator. Exiting...");
            } else {
                System.out.println("Invalid option. Please choose a valid option.");
            }
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

    public int multiply(int x, int y) {
        int z = x * y;
        return z;
    }

    public int divide(int x, int y) {
        int z = x / y;
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
                    3. multiply
                    4. divide
                5.quit
                    """);
    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
