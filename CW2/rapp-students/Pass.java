
/**
 * A Pass has an id number, name, a luxury rating, number of credits and points.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pass {
    private String guestName;
    private int passID;
    private int luxuryRating;
    private int noOfCredits;
    private int noOfPoints;

    public Pass(String guestName, int passID, int luxuryRating, int noOfCredits) {
        this.guestName = guestName;
        this.passID = passID;
        this.luxuryRating = luxuryRating; // NOTE: VALIDATE rating is 1-10
        this.noOfCredits = noOfCredits;
        this.noOfPoints = 0;
    }

    public int getPassID() {
        return passID;
    }

    public int getLuxuryRating() {
        return luxuryRating;
    }

    public int getNoOfCredits() {
        return noOfCredits;
    }

    public boolean isEnoughCredits() {
        if (noOfCredits >= 4) {
            return true;
        } else {
            return false;
        }
    }

    public void addCredits(int credits) {
        noOfCredits += noOfCredits + credits;
    }

    public void deductCredits() {
        if (isEnoughCredits()) {
            noOfCredits -= 4;
            noOfPoints += 1;
        }
    }

    public int pointsToCredits() {
        int convertedPoints = noOfPoints / 3;
        return noOfCredits = convertedPoints;
    }

    public String toString() {
        return "Pass \n guestName=" + guestName + ", \n passID=" + passID + ", \n luxuryRating=" + luxuryRating
        + ", \n noOfCredits=" + noOfCredits + ", \n noOfPoints=" + noOfPoints + "";
    }

}
