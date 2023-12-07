
/**
 * Implements an array of playable objects
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private Playable[] playing;
    private int listPointer;
    
    public Player()
    {
        playing = new Playable[20];
        listPointer = 0;
    }
    
    
    public void addToList(Playable pl)
    {
       if (listPointer < playing.length){
            playing[listPointer] = pl;
        }
        listPointer++; 
    }
    
    public void playOnPC(Playable pl)
    {
        if (pl.canPlayOnPC())
        {
            pl.play();
        }
    }
    
    public void list()
    {
        // print list of Playable objects
        for(int i = 0; i < listPointer; i++) 
        {
            Playable temp = playing[i];
            System.out.println(temp.toString());
            System.out.println();   // empty line between items
        }
    }
    
    public String toString()
    {
        String ss = "";
        // print list of Playable objects
        for(int i = 0; i < listPointer; i++) 
        {
            Playable temp = playing[i];
            ss = ss + temp.toString() + "\n";
        }
        return ss;
    }
    
}
