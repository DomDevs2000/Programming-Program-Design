/**
 * ChildPass
 */
public class ChildPass extends Pass {
    private int parentPassNumber;
    private int zonesVisited;

    // Constructors
    public ChildPass(String guestName, int passID, int luxuryRating, int noOfCredits, int parentPassNumber) {
        super(guestName, passID, 10, noOfCredits);
        this.parentPassNumber = parentPassNumber;
        this.zonesVisited = 0;
    }

    public void deductCredits() {

    }

}
