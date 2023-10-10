
/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {
        int max = 20;
        int current = 21;

        if (current < max) {
            System.out.println("Heating on");

        } else if (current == max) {
            System.out.println("set temperature reached – heating off");
        } else {
            System.out.println("possible fault with system – please check");
        }
    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
