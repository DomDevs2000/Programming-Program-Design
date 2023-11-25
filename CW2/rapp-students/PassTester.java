
/**
 * Write a description of class PassTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassTester {
    public static void main(String[] args) {
        Pass pass = new Pass("Aidan", 10, 10, 10, 10);
        int passId = pass.getPassID();

        System.out.println(passId);

    }

}
