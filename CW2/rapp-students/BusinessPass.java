
public class BusinessPass extends Pass {
    private String organizationName;

    public BusinessPass(String guestName, int passID, int luxuryRating, int noOfCredits, String organizationName) {
        super(guestName, passID, luxuryRating, 30);
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
