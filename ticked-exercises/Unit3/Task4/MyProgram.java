import java.util.*;

/**
 * PROCESSING MARKS
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {
        Scanner userInput = new Scanner(System.in);
        String name = userInput.nextLine();

        if (name == "fred") {
            System.out.println("true");
        }
    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
