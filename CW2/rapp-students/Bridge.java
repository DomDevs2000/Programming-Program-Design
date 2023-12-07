
/**
 * A bridge provides a one-way connection between two zones. It
 * has a bridge code and information about both the source and
 * the destination zone
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bridge {
    private String bridgeCode;
    private Zone sourceZone;
    private Zone destinationZone;

    public Bridge(String bridgeCode, Zone sourceZone, Zone destinationZone) {
        this.bridgeCode = bridgeCode;
        this.sourceZone = sourceZone;
        this.destinationZone = destinationZone;
    }

    public String getBridgeCode() {
        return bridgeCode;
    }

    public Zone getSourceZone() {
        return sourceZone;
    }

    public Zone getDestinationZone() {
        return destinationZone;
    }

    public boolean canUseBridge(Pass pass) {
        int passLuxuryRating = pass.getLuxuryRating();
        int destinationZoneLuxuryRating = destinationZone.getLuxuryRating();
        if (!destinationZone.isFull() && destinationZoneLuxuryRating >= passLuxuryRating && pass.isEnoughCredits()) {
            return true;
        } else {
            return false;
        }
    }

    public String movePass(Pass pass) {
        if (canUseBridge(pass)) {
            sourceZone.leave(pass);
            destinationZone.enter(pass);
            pass.deductCredits();
            // NOTE: rename zone moved to mved across bridge etc
            return "Zone Moved - Credits deducted";
        } else {
            return "Zone not moved - credits not deducted";
        }
    }

    public String toString() {
        return "Bridge [sourceZone=" + sourceZone + "," + sourceZone.getZoneNumber() + ", destinationZone="
                + destinationZone + "," + destinationZone.getZoneNumber() + "]";
    }

}
