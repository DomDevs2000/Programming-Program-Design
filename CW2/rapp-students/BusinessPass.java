/**
 * 
 * @author (Aidan Carvalho)
 * @version (11/12/2023)
 */

public class BusinessPass extends Pass {
    private String organizationName;

    public BusinessPass(int passID, String guestName, int luxuryRating, int noOfCredits, String organizationName) {
        super(passID, guestName, luxuryRating, 30);
        this.organizationName = organizationName;
    }

    @Override
    public void deductCredits() {
        if (isEnoughCredits()) {
            setNoOfCredits(getNoOfCredits() - 3);
            setNoOfPoints(getNoOfPoints() + 2);
        }
    }

    @Override
    public String toString() {
        return "BusinessPass [guestName=" + getGuestName() + "\n  PassID= " + getPassID() + "\n organizationName= "
                + organizationName + " \n luxuryRating="
                + getLuxuryRating() + "\n credits=" + getNoOfCredits() + "\n noOfPoints=" + getNoOfPoints() + "]";
    }

    public String getOrganizationName() {
        return organizationName;
    }

}
