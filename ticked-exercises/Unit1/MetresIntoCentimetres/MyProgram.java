
/**
 * PROCESSING MARKS
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {

        int length = 10;
        int metresIntoCentimetres = length * 100;

        System.out.println(metresIntoCentimetres + " Centimetres");

    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
