
/**
 * A bridge provides a one-way connection between two zones. It
 * has a bridge code and information about both the source and
 * the destination zone
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bridge {
    private int bridgeCode;
    private Zone sourceZone;
    private Zone destinationZone;

    public Bridge(int bridgeCode, Zone sourceZone, Zone destinationZone) {
        this.bridgeCode = bridgeCode;
        this.sourceZone = new Zone("Lobby", 0, 0, 1000, 1000);
        this.destinationZone = new Zone("Concorse", 1, 1, 100, 10);

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

    public String toString() {
        return "Bridge [sourceZone=" + sourceZone + ", destinationZone=" + destinationZone + "]";
    }

}
