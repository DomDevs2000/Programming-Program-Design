import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {
        int[] marks = { 10, 70, 20, 50, 20, 60, 20, 10, 70, 80 };
        for (int i = 0; i < marks.length; i++) {
            int convertedmarks = marks[i] * 80 / 100;

            System.out.println(convertedmarks);
            if (convertedmarks >= 50) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }
        }
        int sum = 0;
        for (int i = 0; i < marks.length - 1; i++) {
            sum += marks[i];
        }

        int averageMarks = sum / marks.length;
        System.out.println(averageMarks);

    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
