
/**
 * A bridge provides a one-way connection between two zones. It
 * has a bridge code and information about both the source and
 * the destination zone
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bridge {
    int bridgeCode;
    Zone sourceZone;
    Zone destinationZone;

    public Bridge(int bridgeCode, Zone sourceZone, Zone destinationZone) {
        this.bridgeCode = bridgeCode;
        this.sourceZone = sourceZone;
        this.destinationZone = destinationZone;
    }

    public int getBridgeCode() {
        return bridgeCode;
    }

    public Zone getSourceZone() {
        return sourceZone;
    }

    public Zone getDestinationZone() {
        return destinationZone;
    }

    public boolean canUseBridge(Pass pass) {
        if (destinationZone.noOfPeople < destinationZone.capacity) {
            return true;
        } else {
            return false;
        }
    }

    public String movePass(Pass pass) {
        int luxuryRating = pass.getLuxuryRating();
        if (canUseBridge(pass) && destinationZone.luxuryRating > luxuryRating) {
            destinationZone.enter(pass);
            pass.travel();
            return "Zone Moved - Credits deducted";
        } else {
            return "Zone not moved - credits not deducted";
        }
    }

    public String toString() {
        return "Bridge [sourceZone=" + sourceZone + ", destinationZone=" + destinationZone + "]";
    }

}
