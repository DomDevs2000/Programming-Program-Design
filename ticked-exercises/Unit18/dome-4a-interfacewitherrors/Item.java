/**
 * The Item class represents a multi-media item.
 * Information about the item is stored and can be retrieved.
 * This class serves as a superclass for more specific itms.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public abstract class Item
{
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    /**
     * Initialise the fields of the item.
     * @param theTitle The title of this item.
     * @param time The running time of this item.
     */
    public Item(String theTitle, int time)
    {
        title = theTitle;
        playingTime = time;
        gotIt = false;
        comment = "";
    }

    /**
     * Enter a comment for this item.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this item.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this item.
     * @param ownIt true if we own the item, false otherwise.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this item.
     */
    public boolean getOwn()
    {
        return gotIt;
    }
    
    /** additional method
     * @return title 
     */
    public String getTitle()
    {
        return title;
    }
    
    /** a print relevant to Item fields **/
    public void print()
    {
        System.out.print("Item: " + title + " (" + playingTime + " mins)");
        if(gotIt) 
        {
            System.out.println("*");
        }
        else 
        {
            System.out.println();
        }
        System.out.println("    " + comment);
    }


    /**
     * returns details about this Item .
     */
    public String toString()
    {
       String s = "";
       s = s+"Item: " + title + " (" + playingTime + " mins)";
       if(gotIt) 
       {
          s = s + "*";
       }
       s = s + "\n    " + comment;
       return s;
    }
    
    public abstract String getMaker();
}
