
/**
 * A Pass has an id number, name, a luxury rating, number of credits and points.
 * 
 * @author Aidan Carvalho
 * @version 11/12/2023
 */
public class Pass {
    private String guestName;
    private int passID;
    private int luxuryRating;
    private int noOfCredits;
    private int noOfPoints;

    public Pass(int passID, String guestName, int luxuryRating, int noOfCredits) {
        this.passID = passID;
        this.guestName = guestName;
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
