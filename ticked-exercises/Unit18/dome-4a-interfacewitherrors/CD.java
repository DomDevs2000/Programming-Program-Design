/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2006.03.30
 */
public class CD extends Item 
{
    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);  // call to parent constructor
        artist = theArtist;
        numberOfTracks = tracks;
    }

    /**
     * @return The artist for this CD.
     */
    public String getMaker()
    {
        return artist;
    }

    /**
     * @return The number of tracks on this CD.
     */
    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }
    
    /** 
     * sets a new artist
     * @dir the new artist
     */
    public void setMaker(String dir)
    {
        artist = dir;
    }
    
    
    /** 
     * sets number of tracks
     * @trks number of tracks
     */
    public void setTracks(int trks)
    {
        numberOfTracks = trks;
    }
 

    /**
     * Print details about this CD to the text terminal.
     */
    public void print()
    {
        super.print(); // call to parent print()
        System.out.println("    " + artist);
        System.out.println("    tracks: " + numberOfTracks);
    }
    
    public String toString()
    {
        return super.toString() + "    " + artist + "\n    tracks: " + numberOfTracks + "\n";
    }
    
//     public boolean canPlayOnPC()
//     {
//         return false;
//     }
//     
//     public void play()
//     {
//         System.out.println(getTitle() + "  .... can't be played");
//     }
}
