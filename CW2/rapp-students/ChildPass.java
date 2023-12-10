
public class ChildPass extends Pass {
    private int parentPassNumber;
    private int zonesVisited;

    public ChildPass(int passID, String guestName, int luxuryRating, int noOfCredits, int parentPassNumber) {
        super(passID, guestName, 10, noOfCredits);
        this.parentPassNumber = parentPassNumber;
        this.zonesVisited = 0;
    }

    public boolean isEnoughCredits() {
        return true;
    }

    @Override
    public void deductCredits() {
        setNoOfPoints(getNoOfPoints() + 1);
        zonesVisited = zonesVisited + 1;
    }

    @Override
    public String toString() {
        return "ChildPass" + "\n guestName=" + getGuestName() + "\n PassID=" + getPassID() + "\n parentPassNumber="
                + parentPassNumber
                + ", \n zonesVisited=" + zonesVisited
                + "\n luxuryRating="
                + getLuxuryRating() + "\n credits=" + +getNoOfCredits() + "\n noOfPoints=" + getNoOfPoints() + "]";
    }

    public int getParentPassNumber() {
        return parentPassNumber;
    }

    public int getZonesVisited() {
        return zonesVisited;
    }

}
