 

import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 marks:");

        // Initialize an array to store the marks
        int[] marks = new int[10];

        // Use a loop to get user input for each mark
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        double averageMarks = sum / marks.length;

        System.out.println("Average Mark: " + averageMarks);
    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
