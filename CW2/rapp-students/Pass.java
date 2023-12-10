
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

    // NOTE: swap id and name
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

    public String getGuestName() {
        return guestName;
    }

    public int getNoOfPoints() {
        return noOfPoints;
    }

    public boolean isEnoughCredits() {
        if (noOfCredits >= 4) {
            return true;
        } else {
            return false;
        }
    }

    public void addCredits(int credits) {
        noOfCredits += credits;
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

    // Mutator methods for inherited classes
    public void setLuxuryRating(int luxuryRating) {
        this.luxuryRating = luxuryRating;
    }

    public void setNoOfCredits(int noOfCredits) {
        this.noOfCredits = noOfCredits;
    }

    public void setNoOfPoints(int noOfPoints) {
        this.noOfPoints = noOfPoints;
    }

    public String toString() {
        return "Pass \n guestName=" + guestName + ", \n passID=" + passID + ", \n luxuryRating=" + luxuryRating
                + ", \n noOfCredits=" + noOfCredits + ", \n noOfPoints=" + noOfPoints + "";
    }

}
