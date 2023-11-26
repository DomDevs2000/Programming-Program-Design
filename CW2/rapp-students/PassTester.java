
/**
 * Write a description of class PassTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassTester {
    public static void main(String[] args) {
        Pass pass = new Pass("Aidan", 10, 5, 15);
        int passId = pass.getPassID();
        int luxuryRating = pass.getLuxuryRating();
        int credits = pass.getNoOfCredits();
        System.out.println(credits);
        // NOTE: flip variables and string
        System.out.println(passId + " expect passID of 10");
        System.out.println(luxuryRating + " expect luxury rating of 5");
        System.out.println(credits + " expect credits of 15");
        System.out.println(pass.toString());
        // assert credits == 12 : "Connection is null";
        pass.travel();
        System.out.println(pass.getNoOfCredits() + " expect credits of 11 after travel ");
    }

}
