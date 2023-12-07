/**
 * The DVD class represents a DVD object. Information about the 
 * DVD is stored and can be retrieved. We assume that we only deal 
 * with movie DVDs at this stage.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public class DVD extends Item implements Playable 
{
    private String director;

    /**
     * Constructor for objects of class DVD
     * @param theTitle The title of this DVD.
     * @param theDirector The director of this DVD.
     * @param time The running time of the main feature.
     */
    public DVD(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);  // call  to parent constructor
        director = theDirector;
    }

    /**
     * @return The director for this DVD.
     */
    public String getMaker()
    {
        return director;
    }
    
    /** 
     * sets a new director
     * @dir the new director
     */
    public void setDirector(String dir)
    {
        director = dir;
    }

    /**
     * Print details about this DVD to the text terminal.
     */
    public void print()
    {
        super.print();  // call to parent print()
        System.out.println("    " + director);
    }
    
    public String toString()
    {
        return super.toString() + "      " + director + "\n";
    }
    
    public boolean canPlayOnPC()
    {
        return true;
    }
    
    public void play()
    {
        System.out.println("\nNow playing...." + getTitle());
    }
}
