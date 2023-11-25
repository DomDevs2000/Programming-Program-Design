
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

    public Pass(String guestName, int passID, int luxuryRating, int noOfCredits, int noOfPoints) {
        this.guestName = guestName;
        this.passID = passID;
        this.luxuryRating = luxuryRating;
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
        if (noOfCredits > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int pointsToCredits(int noOfPoints) {
        int convertedPoints = noOfPoints / 3;
        return noOfCredits = convertedPoints;
    }

    public String toString() {
        return "Pass [guestName=" + guestName + ", passID=" + passID + ", luxuryRating=" + luxuryRating
                + ", noOfCredits=" + noOfCredits + ", noOfPoints=" + noOfPoints + "]";
    }

}
