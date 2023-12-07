import java.util.ArrayList;

/**
 * The database class provides a facility to store Item and video 
 * objects. A list of all Items and videos can be printed to the
 * terminal.
 * 
 * 
 */
public class Database
{
    private Item[] items;
    private int itemPointer = 0;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new Item[20];
    }

    /**
     * Add a Item to the database.
     * @param theItem The Item to be added.
     */
    public void addItem(Item theItem)
    {
        if (itemPointer < items.length){
            items[itemPointer] = theItem;
        }
        itemPointer++;
    }



    /**
     * Print a list of all currently stored Items and DVDs to the
     * text terminal.
     */
    public void list()
    {
        // print list of Items
        for(int i = 0; i < itemPointer; i++) {
            items[i].print();
            System.out.println();   // empty line between items
        }
    }
    
    
    public void setAllOwn()
    {
        for(int i = 0; i<itemPointer; i++)
        {   
            // call parent method
            items[i].setOwn(true); 
        }
    }
    
    public String toString()
    {
        String ss = "\n";
        for(int i = 0; i<itemPointer; i++)
        {   
            // call parent method
            ss = ss + items[i].toString() + "\n"; 
        }
        return ss;
    }
    

//     // Will no longer compile
//     public String getDirectors()
//     {
//         String s = "";
//         for(int i = 0; i<itemPointer; i++)
//         {
//            if (items[i] instanceof DVD)
//            {
//                String temp = ((DVD)items[i]).getDirector();
//                s  = s + temp + "\n";
//            }
//         }
//         s = s + "\n========================";
//         return s;
//      }

    public String getMakers()
    {
        String s = "";
        for(int i = 0; i<itemPointer; i++)
        {   // no need for casting
            String temp = items[i].getMaker();
            s  = s + temp + "\n";
        }
        s = s + "\n========================";
        return s;
     }


}


