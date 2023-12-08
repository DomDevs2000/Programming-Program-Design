import java.util.*;

/**
 * Write a description of class MyTester here.
 * 
 * @author
 * @version
 */
public class MyTester {

    private void doTest() {
        RAPP fantasia = new Park("Fantasia Pleasure Park");
        Scanner enter = new Scanner(System.in);

        // Zone tests

        // Create zone object
        Zone zone = new Zone("Lobby", 0, 0, 1000);
        // create 2 different pass objects to be used in the zone
        Pass pass = new Pass("Aidan", 123, 3, 10);
        Pass pass2 = new Pass("Dom", 321, 3, 10);

        int zoneNumber = zone.getZoneNumber();
        String zoneName = zone.getName();
        int zoneLuxuryRating = zone.getLuxuryRating();
        String zoneAsString = zone.toString();

        zone.enter(pass);
        zone.enter(pass2);
        // print out
        System.out.println("********* Zone Class Tests **********");
        System.out.println("Zone Number Is: " + zoneNumber + " - expected to be - 0");
        System.out.println("Zone Name Is: " + zoneName + " - expected to be - Lobby");
        System.out.println("Zone Luxury Rating Is: " + zoneLuxuryRating + " expected to be -  0");
        System.out.println(zone.listAllPasses() + "expected to be 2 pass objects");
        System.out.println("Zone Object As A String Is: " + zoneAsString); // NOTE: passes field is empty after
                                                                           // zone.enter -- listAllPasses() in zone obj
        // test to find pass details by pass id
        System.out.println(zone.findPassDetails(123) + " Expected to return Pass obj with passID of 123");
        System.out.println(zone.findPassDetails(321) + " Expected to return Pass obj with passID of 321");
        // test to see if boolean method returns true or false is the pass is in zone
        System.out.println(zone.isPassInZone(pass) + " Expected to be true");
        // remove one pass from the zone
        zone.leave(pass2);
        System.out.println(zone.isPassInZone(pass2) + " Expected to be false");
        System.out.println(zone.toString());

        // Bridge MyTester
        // Create 2 new zone objects for source and destination zones
        Zone lobby = new Zone("Lobby", 0, 0, 1000);
        Zone concourse = new Zone("Concourse", 1, 1, 100);
        // Create bridge object
        Bridge bridge = new Bridge("ABC", lobby, concourse);
        bridge.toString();
        String bridgeCode = bridge.getBridgeCode();
        Zone sourceZone = bridge.getSourceZone();
        Zone destinationZone = bridge.getDestinationZone();

        System.out.println("********* Bridge Class Tests **********");
        System.out.println("Expect bridge code of ABC - result is: " + bridgeCode);
        System.out.println(
                "Expect to return a zone obj with name: lobby, zoneNumber: 0, luxuryRating: 0, capacity: 1000 - result is: "
                        + "\n" + sourceZone);
        System.out.println(
                "Expect to return a zone obj with name: lobby, zoneNumber: 1, luxuryRating: 1, capacity: 100 - result is: "
                        + "\n" +
                        destinationZone);
        System.out.println("Expected to return false" + bridge.canUseBridge(pass));

    }

    public static void main(String[] args) {
        MyTester xx = new MyTester();
        xx.doTest();
    }
}
