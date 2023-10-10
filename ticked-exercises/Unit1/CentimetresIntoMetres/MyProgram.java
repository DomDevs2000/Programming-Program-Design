
/**
 * PROCESSING MARKS
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {

        double length = 60;
        double cmIntoMetres = length / 100;

        System.out.println(cmIntoMetres + " Metres");

    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
