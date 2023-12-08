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
        Zone zone = new Zone("Lobby", 123, 3, 10, 10);
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
        System.out.println("Zone Number Is: " + zoneNumber + " - expected to be - 123");
        System.out.println("Zone Name Is: " + zoneName + " - expected to be - Lobby");
        System.out.println("Zone Luxury Rating Is: " + zoneLuxuryRating + " expected to be -  3");
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

    }

    public static void main(String[] args) {
        MyTester xx = new MyTester();
        xx.doTest();
    }
}
