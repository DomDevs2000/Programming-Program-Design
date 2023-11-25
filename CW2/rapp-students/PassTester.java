
/**
 * Write a description of class PassTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassTester {
    public static void main(String[] args) {
        Pass pass = new Pass("Aidan", 10, 5, 15, 20);
        int passId = pass.getPassID();
        int luxuryRating = pass.getLuxuryRating();
        int credits = pass.getNoOfCredits();

        System.out.println(passId + " expect passID of 10");
        System.out.println(luxuryRating + " expect  luxury rating of 5");
        System.out.println(credits + " expect credits of 15");

    }

}
