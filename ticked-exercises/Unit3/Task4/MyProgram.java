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
        String secondName = userInput.nextLine();

        if (name.equals(secondName)) {
            System.out.println("the same");
        } else {
            System.out.println("different");

        }

        userInput.close();
    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
