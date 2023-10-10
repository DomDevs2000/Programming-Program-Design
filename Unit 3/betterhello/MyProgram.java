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
        String name = "";
        System.out.println("Enter your name"); // output the question
        name = reader.nextLine(); // catch the input
        System.out.println(name + "says Hello World");

    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
