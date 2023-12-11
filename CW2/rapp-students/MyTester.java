import java.util.*;

/**
 * Write a description of class MyTester here.
 * Tester class that tests the Zone, Bridge and Park classes and their methods
 * 
 * @author (Aidan Carvalho)
 * @version (11/12/2023)
 */
public class MyTester {

    private void doTest() {
        RAPP fantasia = new Park("Fantasia Pleasure Park");
        Scanner enter = new Scanner(System.in);

        // Zone tests

        // Create zone object
        Zone zone = new Zone("Lobby", 0, 0, 1000);
        // create 2 different pass objects to be used in the zone
        Pass pass = new Pass(123, "Aidan", 3, 10);
        Pass pass2 = new Pass(321, "Dom", 3, 10);

        // acccess fields of zone object object to be used in all tests
        int zoneNumber = zone.getZoneNumber();
        String zoneName = zone.getName();
        int zoneLuxuryRating = zone.getLuxuryRating();

        // Add both passes to the lobby
        zone.enter(pass);
        zone.enter(pass2);

        // accessor method on pass Id once the passes have been added to the zone
        int passId = pass.getPassID();
        int passId2 = pass2.getPassID();

        String zoneAsString = zone.toString();
        // print out
        System.out.println("********* Zone Class Tests **********");
        System.out.println("Zone Number Is: " + zoneNumber + " - expected to be - 0");
        System.out.println("Zone Name Is: " + zoneName + " - expected to be - Lobby");
        System.out.println("Zone Luxury Rating Is: " + zoneLuxuryRating + " expected to be -  0");
        System.out.println(zone.listAllPasses() + "expected to be 2 pass objects");
        System.out.println("Zone Object As A String Is: " + zoneAsString);

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

        // Create 2 new passes 1 that can move to the next zone and one that cannot;
        Pass passThatCanMoveZone = new Pass(456, "John", 5, 10);
        Pass passThatCannotMoveZone = new Pass(789, "Jane", 0, 10);

        // Create bridge object
        Bridge bridge = new Bridge("ABC", lobby, concourse);

        // call acccessor methods - save to variable
        String bridgeCode = bridge.getBridgeCode();
        // source zone accessors
        Zone sourceZone = bridge.getSourceZone();
        String sourceZoneName = sourceZone.getName();
        int sourceZoneNumber = sourceZone.getZoneNumber();
        // Destination zone accesors
        Zone destinationZone = bridge.getDestinationZone();
        String destinationZoneName = destinationZone.getName();
        int destinationZoneNumber = destinationZone.getZoneNumber();
        // to string method
        String bridgeAsString = bridge.toString();

        // print expected and actual result
        System.out.println("********* Bridge Class Tests **********");

        System.out.println("Expect bridge code of ABC - result is: " + bridgeCode);
        System.out.println(
                "Expect to return a zone with name lobby and id of 0 - actual result is: "
                        + "\n Zone Name: " + sourceZoneName + "\n Zone Number: " + sourceZoneNumber);
        System.out.println(
                "Expect to return a zone with name Concourse and id of 1 - actual result is: "
                        + "\n Zone Name: " + destinationZoneName + "\n Zone Number: " + destinationZoneNumber);
        System.out.println("Expected to return a bridge obj - result is: \n" + bridgeAsString);
        System.out.println("Expected to return true - result is: " + bridge.canUseBridge(passThatCanMoveZone));
        System.out.println("Expected to return false - result is: " + bridge.canUseBridge(passThatCannotMoveZone));

        String zoneMoved = bridge.movePass(passThatCanMoveZone);
        String zoneNotMoved = bridge.movePass(passThatCannotMoveZone);

        System.out.println(zoneMoved);
        System.out.println(zoneNotMoved);

        // Park tests
        System.out.println("********** Park Class Tests *************");
        // Test that returns all the zones in the park, and all passes in zones:
        // all passes should currelty be in the lobby zone
        System.out.println(fantasia.toString());

        // Test to get the current zone of the pass - should return Lobby
        System.out.println(fantasia.getPassLocation(1001));
        // Test to return true or false whether the pass can move
        System.out.println("Expected result true: " + fantasia.canMove(1001, "ABC1"));

        System.out.println("Expected result = String saying Pass with ID has moved across bridge: " + fantasia.move(1001, "ABC1"));

        // Test to check top up credit method
        System.out.println("Expected to top up credits by 10");
        fantasia.topUpCredits(1001, 10);
        // Expect pass obj to have noOfCredits = 30
        System.out.println(fantasia.getPassDetails(1001));
        // Convert current credits to points
        fantasia.convertPoints(1001);
        System.out.println("Expected to convert credits to points - expected 10 points from 30 credits");
        // should return noOfPoints = 10
        System.out.println(fantasia.getPassDetails(1001));

    }

    public static void main(String[] args) {
        MyTester xx = new MyTester();
        xx.doTest();
    }
}
