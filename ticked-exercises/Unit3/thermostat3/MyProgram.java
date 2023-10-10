
/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {
        int max = 20;
        int current = 22;
        int min = 15;

        if (current < max) {
            System.out.println("Heating on");
        } else if (current < min) {
            System.out.println("your house is too cold – heating is on");
        } else if ((current >= min) && (current <= max)) {
            System.out.println("comfortable temperature");
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
