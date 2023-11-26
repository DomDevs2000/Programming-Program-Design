
import java.util.*;

/**
 * A Zone is part of a RAPP resort.Each zone has a name, a luxury rating
 * and a capacity which represents the maximum number of people(passes) who can
 * be on the
 * zone at any one time. Each zone must maintain a list of all people (passes)
 * currently on the zone. These lists are updated whenever passes enter or leave
 * an zone,so that it is always possible to say how many people (passes) are in
 * the zone
 * and who they are.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

public class Zone {
    private String name;
    private int zoneNumber;
    private int luxuryRating;
    private int capacity;
    private int noOfPeople;

    ArrayList<Pass> passes = new ArrayList<Pass>();

    public Zone(String name, int zoneNumber, int luxuryRating, int capacity, int noOfPeople) {
        this.name = name;
        this.zoneNumber = zoneNumber;
        this.luxuryRating = luxuryRating;
        this.capacity = capacity;
        this.noOfPeople = noOfPeople;
    }

    public int getZoneNumber() {
        return zoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getLuxuryRating() {
        return luxuryRating;
    }

    public void enter(Pass pass) {
        passes.add(pass);
    }

    public void leave(Pass pass) {
        int position = passes.indexOf(pass);
        if (position != -1) {
            passes.remove(position);
        }
    }

    public String toString() {
        return "Zone [name=" + name + ", zoneNumber=" + zoneNumber + ", luxuryRating=" + luxuryRating + ", capacity="
                + capacity + ", noOfPeople=" + noOfPeople + "]";
    }

}
