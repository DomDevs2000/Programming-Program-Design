
/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {
        int age = 11;

        if (age >= 16) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }
    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
