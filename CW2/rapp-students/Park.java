
import java.util.*;

/**
 * This class implements the RAPP interface
 *
 * @author Aidan Carvalho
 * @version 11/12/23
 **/
public class Park implements RAPP {
    private String parkName;
    private ArrayList<Pass> allPasses = new ArrayList<Pass>();
    private ArrayList<Zone> zones = new ArrayList<Zone>();
    private ArrayList<Bridge> bridges = new ArrayList<Bridge>();

    // complete this section by adding other required fields

    /**
     * constructor
     * 
     * @param nme - name of park
     */
    public Park(String nme) {
        parkName = nme;
        loadZones();
        loadPasses();
        setUpBridges();

        Zone lobby = getZone("Lobby");
        for (Pass pass : allPasses) {
            lobby.enter(pass);

        }

    }

    /**
     * Returns all of the details of the park: its name and its zones
     * including lists of passes in each zone.
     */
    public String toString() {

        return "Park [parkName=" + parkName + ", zones=" + zones + "]";

    }

    /**
     * Returns a String with details of a pass
     * 
     * @param passId - id number of the pass
     * @return the details of the pass as a String, or "No such pass"
     */
    public String getPassDetails(int passId) {
        Pass pass = getPass(passId);

        if (pass.getPassID() == passId) {
            return pass.toString();
        } else {
            return "No such pass";
        }
    }

    /**
     * Returns the name of the zone which contains the specified pass or null
     * 
     * @param ccd - the specified pass
     * @return the name of the Zone which contains the pass, or null
     **/
    public String getPassLocation(int cd) {
        Pass pass = getPass(cd);
        for (Zone zone : zones) {
            if (zone.isPassInZone(pass)) {
                String zoneName = zone.getName();
                return zoneName;
            }
            return null;
        }

        return null;
    }

    /**
     * Given the name of a zone, returns the zone id number
     * or -1 if zone does not exist
     * 
     * @param name of zone
     * @return id number of zone
     */
    public int getZoneNumber(String ww) {
        Zone zone = getZone(ww);
        int zoneNumber = zone.getZoneNumber();
        if (zoneNumber >= 0) {
            return zoneNumber;
        }
        return -1;
    }

    /**
     * Returns a String representation of all the passes on specified zone
     * 
     * @param zone is the name of the zone
     * @return a String representation of all passes on specified zone
     **/
    public String getAllPassesInOneZone(String zone) {
        Zone requestedZone = getZone(zone);
        return requestedZone.listAllPasses();
    }

    /**
     * Returns true if a Pass is allowed to move using the bridge, false otherwise
     * A move can be made if:
     * the rating of the pass >= the rating of the destination zone
     * AND the destination zone is not full
     * AND the pass has sufficient credits
     * AND the pass is currently in the source zone
     * AND the pass id is for a pass on the system
     * AND the bridge code is the code for a bridge on the system
     * 
     * @param trId   is the id of the pass requesting the move
     * @param znCode is the code of the bridge by which the pass wants to move
     * @return true if the pass is allowed on the bridge journey, false otherwise
     **/
    public boolean canMove(int trId, String znCode) {
        Pass pass = getPass(trId);
        Bridge bridge = getBridge(znCode);

        if (pass != null && bridge != null) {
            Zone sourceZone = bridge.getSourceZone();
            boolean isPassInZone = sourceZone.isPassInZone(pass);
            boolean canUseBridge = bridge.canUseBridge(pass);
            return (isPassInZone && canUseBridge);
        }

        return false;
    }

    /**
     * Returns the result of a pass requesting to move over a bridge.
     * A move will be successful if:
     * the luxury rating of the pass >= the luxury rating of the destination zone
     * AND the destination zone is not full
     * AND the pass has sufficient credits
     * AND the pass is currently in the source zone
     * AND the pass id is for a pass in the system
     * AND the bridge code is the code for a bridge on the system
     * If the bridge crossing can be made, the pass information is removed from
     * the source zone, added to the destination zone, pass details updated and a
     * suitable message returned.
     * a suitable message returned.
     * If bridge journey cannot be made, the state of the system remains unchanged
     * and a message specifying the reason is returned.
     * 
     * @param pPassId is the id of the pass requesting the move
     * @param znCode  is the code of the bridge by which the pass wants to move
     * @return a String giving the result of the request
     **/
    public String move(int pPassId, String znCode) {

        Pass pass = getPass(pPassId);

        if (canMove(pPassId, znCode)) {
            Bridge bridge = getBridge(znCode);

            if (bridge.canUseBridge(pass)) {
                bridge.movePass(pass);
                return "Pass with ID " + pass.getPassID() + " moved across bridge: " + bridge.getBridgeCode();
            }
        }
        return "Pass with ID " + pass.getPassID() + " could not move across bridge";
    }

    /**
     * Allows a pass to top up their credits.This method is not concerned with
     * the cost of a credit as currency and prices may vary between resorts.
     * 
     * @param id    the id of the pass toping up their credits
     * @param creds the number of credits purchased to be added to passes
     *              information
     */
    public void topUpCredits(int id, int creds) {
        Pass pass = getPass(id);
        pass.addCredits(creds);
    }

    /**
     * Allows a pass to convert its points to credits
     * 
     * @param cdId the id of the pass converting their credits
     */
    public void convertPoints(int cdId) {
        Pass pass = getPass(cdId);

        pass.pointsToCredits();
    }

    // ***************private methods**************
    private void loadZones() {
        zones.add(new Zone("Lobby", 0, 0, 1000));
        zones.add(new Zone("Concourse", 1, 3, 100));
        zones.add(new Zone("Waterworld", 2, 3, 10));
        zones.add(new Zone("WildWest", 3, 5, 2));
        zones.add(new Zone("Solitaire", 4, 1, 1));

    }

    private void setUpBridges() {
        bridges.add(new Bridge("ABC1", zones.get(0), zones.get(1)));
        bridges.add(new Bridge("BCD2", zones.get(1), zones.get(0)));
        bridges.add(new Bridge("CDE3", zones.get(1), zones.get(2)));
        bridges.add(new Bridge("DEF4", zones.get(2), zones.get(1)));
        bridges.add(new Bridge("JKL8", zones.get(2), zones.get(3)));
        bridges.add(new Bridge("EFG5", zones.get(3), zones.get(1)));
        bridges.add(new Bridge("GHJ6", zones.get(1), zones.get(4)));
        bridges.add(new Bridge("HJK7", zones.get(4), zones.get(1)));
    }

    private void loadPasses() {

        allPasses.add(new Pass(1000, "Lynn", 5, 10));
        allPasses.add(new Pass(1001, "May", 3, 20));
        allPasses.add(new Pass(1002, "Nils", 10, 20));
        allPasses.add(new Pass(1003, "Olek", 2, 12));
        allPasses.add(new Pass(1004, "Pan", 3, 4));
        allPasses.add(new Pass(1005, "Quin", 1, 5));
        allPasses.add(new Pass(1006, "Raj", 10, 6));
        allPasses.add(new Pass(1007, "Sol", 7, 20));
        allPasses.add(new Pass(1008, "Tel", 6, 24));
        // Task 7
        allPasses.add(new TouristPass(1009, "Una", 5, 20, "TUI", 12345));
        allPasses.add(new ChildPass(1010, "Val", 10, 0, 999));
        allPasses.add(new BusinessPass(1011, "Wei", 5, 20, "Next"));

    }

    /**
     * Returns the pass with the pass id specified by the parameter
     * 
     * @return the pass with the specified id
     **/
    private Pass getPass(int id) {
        for (Pass pass : allPasses) {
            if (pass.getPassID() == id) {
                return pass;
            }
        }

        return null;
    }

    /**
     * Returns the zone with the name specified by the parameter
     * 
     * @return the zone with the specified name
     **/
    private Zone getZone(String zoneName) {
        for (Zone zone : zones) {
            if (zone.getName().equals(zoneName)) {
                return zone;
            }
        }
        return null;
    }

    /**
     * Returns the zone with the name specified by the parameter
     * 
     * @return the zone with the specified name
     **/
    private Bridge getBridge(String br) {

        for (Bridge bridge : bridges) {
            if (bridge.getBridgeCode().equals(br)) {
                return bridge;
            }
        }
        return null;
    }

}
