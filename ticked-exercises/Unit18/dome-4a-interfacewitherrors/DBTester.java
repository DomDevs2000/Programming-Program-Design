
/**
 * Write a description of class Tester here.
 * 
 * @author A.A.Marczyk 
 * @version 2017.10.18
 */
public class DBTester
{
    public static void main(String args[]){
        // Does not take advantage of inheritance
        Database db = new Database();
        //Playable xx = new Playable();
        //Item zz = new Item();
        
        CD cd1 = new CD("Funky Music", "Joe Bloggs", 10, 80);
        DVD dvd1 = new DVD("Psycho","Hitchcock",160);
        // Item it1 = new Item("XXX",100);
        
        //Polymorphic creation
        Item cd2 = new CD("Boring Music", "Fred Bloggs", 7, 80);
        Item dvd2 = new DVD("Bambi","Disney",100);
        
        // Won't compile
        //CD cd3 = new Item("Metallica",100);
        //DVD dvd3 = new Item("Alien",150);
        //CD cd3 = new DVD("Metallica","Metallica, 100);
        
        // db.addItem(it1);
        db.addItem(cd2);        
        db.addItem(dvd2);
        
        //polymorphic method call
        db.addItem(cd1);
        db.addItem(dvd1);        

        // db.list();
        
        // calling parent methods
        db.setAllOwn();
        System.out.println(db.toString());
        
        // calling subclass method
        System.out.println("Listing makers");
        System.out.println(db.getMakers());
    }
}
