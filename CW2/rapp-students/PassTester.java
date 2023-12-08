
/**
 * Write a description of class PassTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassTester {
    public static void main(String[] args) {
        // Create pass object
        Pass pass = new Pass("Aidan", 10, 5, 15);
        // call the accessor methods - save to variable
        int passId = pass.getPassID();
        int luxuryRating = pass.getLuxuryRating();
        int credits = pass.getNoOfCredits();
        String passAsString = pass.toString();
        // print result

        System.out.println("Expect passID of 10 - result is: " + passId);
        System.out.println("Expect luxury rating of 5 - result is: " + luxuryRating);
        System.out.println("Expect credits to be 15 -  result is:  " + credits);
        System.out.println(
                "Expect pass object with name: Aidan, passId: 10, luxuryRating: 5, noOfcredits: 15, noOfPoints: 0 - \n result is: "
                        + passAsString);

        pass.deductCredits();
        System.out.println("Expect credits of 11 after travel - result is:  " + pass.getNoOfCredits());
    }

}
