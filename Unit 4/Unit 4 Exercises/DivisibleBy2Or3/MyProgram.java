import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {
        for (int i = 0; i < 25; i++) {
            if (i % 2 == 0 && i % 3 == 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
