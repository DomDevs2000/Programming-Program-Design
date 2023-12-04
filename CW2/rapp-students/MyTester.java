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

        // Zone obj tests
        Zone zone = new Zone("1", 123, 3, 10, 10);
        Pass pass = new Pass("aidan", 123, 3, 10);
        Pass pass2 = new Pass("Dom", 321, 3, 10);
        zone.getZoneNumber();
        zone.getName();
        zone.getLuxuryRating();
        zone.toString();
        zone.enter(pass);
        zone.enter(pass2);
        System.out.println(zone.findPassDetails(123));
        System.out.println(zone.findPassDetails(321));

        System.out.println(zone.listAllPasses());
        System.out.println(zone.isPassInZone(pass));
        System.out.println(zone.isPassInZone(pass2));
        System.out.println(zone.toString());

    }

    public static void main(String[] args) {
        MyTester xx = new MyTester();
        xx.doTest();
    }
}
