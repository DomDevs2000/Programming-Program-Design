/**
 * ZoneTester
 */
public class ZoneTester {

    public static void main(String[] args) {
        Zone zone = new Zone("1", 123, 3, 10, 10);
        Pass pass = new Pass("aidan", 123, 3, 10);
        zone.getZoneNumber();
        zone.getName();
        zone.getLuxuryRating();
        zone.toString();
        zone.enter(pass);

    }
}
