
import java.util.*;

/**
 * Write a description of class ParkUI here.
 * 
 * @author Aidan Carvalho
 * @version 11/12/2023
 */
public class ParkUI {

    private Scanner reader = new Scanner(System.in);
    private RAPP fantasia = new Park("Wayward Asteroids");

    private void runUI() {

        int choice = getOption();
        while (choice != 0) {
            // process choice
            if (choice == 1) {
                listAllZones();
            } else if (choice == 2) {
                listAllPasses();
            } else if (choice == 3) {
                listOneZone();
            } else if (choice == 4) {
                findPassLocation();
            } else if (choice == 5) {
                tryTravel();
            } else if (choice == 6) {
                moveNow();
            } else if (choice == 7) {
                updateCredits();
            } else if (choice == 8) {
                getPassInfo();
            }
            // output menu & get choice
            choice = getOption();
        }
        System.out.println("\nThank-you");
    }

    private int getOption() {
        System.out.println("What would you like to do ?");
        System.out.println("0. Quit");
        System.out.println("1. List all zone details");
        System.out.println("2. List all passes on each zone");
        System.out.println("3. List all passes on one zone");
        System.out.println("4. Find pass location");
        System.out.println("5. Say if pass can move by bridge");
        System.out.println("6. Move a pass by bridge");
        System.out.println("7. Top up credits");
        System.out.println("8. Get pass details");

        System.out.println("Enter your choice");
        // read choice
        int option = reader.nextInt();
        reader.nextLine();
        return option;
    }

    // This one has been done for you
    private void listAllZones() {
        System.out.println(fantasia.toString());
    }

    // provide the code here
    private void listAllPasses() {
        String[] zoneNames = { "Lobby", "Concourse", "Waterworld", "WildWest", "Solitaire" };
        for (String zoneName : zoneNames) {
            System.out.println(zoneName);
            System.out.println(fantasia.getAllPassesInOneZone(zoneName));
        }
    }

    // This one has been done for you
    private void listOneZone() {
        // NOTE: validate lowercase
        System.out.println("Enter name of zone");
        String ww = reader.nextLine();
        System.out.println(fantasia.getAllPassesInOneZone(ww));
    }

    // provide the code here
    private void findPassLocation() {
        System.out.println("Enter pass id");
        int passId = reader.nextInt();
        System.out
                .println("Pass with Id " + passId + " is currently in the " + fantasia.getPassLocation(passId)
                        + " zone");

    }

    // This one has been done for you
    private void tryTravel() {
        System.out.println("Enter pass id");
        int trav = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter bridge code");
        String bridge = reader.nextLine();
        System.out.println(fantasia.canMove(trav, bridge));
    }

    // Provide the code here
    private void moveNow() {
        System.out.println("Enter pass id");
        int trav = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter bridge code");
        String bridge = reader.nextLine();
        System.out.println(fantasia.move(trav, bridge));

    }

    // provide the code here
    private void updateCredits() {
        System.out.println("Enter pass id");
        int passId = reader.nextInt();
        System.out.println("Enter number of credits to top up");
        int credits = reader.nextInt();

        fantasia.topUpCredits(passId, credits);
        System.out.println("Credits topped up");

    }

    private void getPassInfo() {
        System.out.println("Enter pass id");
        int trav = reader.nextInt();
        System.out.println(fantasia.getPassDetails(trav));
    }

    public static void main(String[] args) {
        ParkUI xx = new ParkUI();
        xx.runUI();
    }
}
