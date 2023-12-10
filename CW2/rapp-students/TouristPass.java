
public class TouristPass extends Pass {

    private String tourOperatorName;
    private int operatorId;

    public TouristPass(String guestName, int passID, int luxuryRating, int noOfCredits, String tourOperatorName,
            int operatorId) {
        super(guestName, passID, luxuryRating, noOfCredits);
        this.tourOperatorName = tourOperatorName;
        this.operatorId = operatorId;
    }

    @Override
    public String toString() {
        return "TouristPass [tourOperatorName=" + tourOperatorName + ", operatorId=" + operatorId + "]";
    }
}
