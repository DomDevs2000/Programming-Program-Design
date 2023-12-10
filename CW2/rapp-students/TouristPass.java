
public class TouristPass extends Pass {

    private String tourOperatorName;
    private int operatorId;

    public TouristPass(int passID, String guestName, int luxuryRating, int noOfCredits, String tourOperatorName,
            int operatorId) {
        super(passID, guestName, luxuryRating, noOfCredits);
        this.tourOperatorName = tourOperatorName;
        this.operatorId = operatorId;
    }

    @Override
    public String toString() {
        return "TouristPass [tourOperatorName=" + tourOperatorName + ", \n operatorId=" + operatorId
                + " \n luxuryRating "
                + getLuxuryRating() + "\n credits" + +getNoOfCredits() + "\n noOfPoints" + getNoOfPoints() + "]";
    }

    public String getTourOperatorName() {
        return tourOperatorName;
    }

    public int getOperatorId() {
        return operatorId;
    }
}
