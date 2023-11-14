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
        System.out.println("Converter");

        String conversionChoice = displayMenu();

        if (conversionChoice.equals("c")) {
            double fahrenheit = getInputValue();
            double celsius = fahrenheitToCelsius(fahrenheit);
            printResult("Temperature in Celsius: ", celsius);
        } else if (conversionChoice.equals("f")) {

            double celsius = getInputValue();
            double fahrenheit = celsiusToFahrenheit(celsius);
            printResult("Temperature in Fahrenheit: ", fahrenheit);
        } else {
            System.out.println("Invalid choice. Please enter C or F.");
        }

        System.out.println("Thank you for using the temperature converter");
        reader.close();
    }

    public double getInputValue() {
        System.out.println("Enter temperature value: ");
        return reader.nextDouble();
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    public void printResult(String message, double result) {
        System.out.println(message + result);
    }

    public String displayMenu() {
        System.out.println("Enter C for Fahrenheit to Celsius conversion, F for Celsius to Fahrenheit conversion:");
        return reader.next();
    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
