/**
 * BusinessPass
 */
public class BusinessPass extends Pass {
    private String organizationName;

    public BusinessPass(String organizationName, int passID, int luxuryRating, int noOfCredits) {
        super(organizationName, passID, 30, 0); // 30 credits and 0 points initially
        this.organizationName = organizationName;
    }

}
