import java.util.ArrayList;
/**
 * Implements an ArrayList of playable objects
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlayerList
{
    private ArrayList<Playable> playList;
    
    public PlayerList()
    {
        playList = new ArrayList<Playable>();

    }
    
    
    public void addToList(Playable pl)
    {
            playList.add(pl);
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
        for(int i = 0; i < playList.size(); i++) 
        {
            Playable temp =playList.get(i);
            
            System.out.println(temp.toString());
            System.out.println();   // empty line between items
        }
    }
    
    public String toString()
    {
        String ss = "";
        // print list of Playable objects
        for(int i = 0; i < playList.size(); i++) 
        {
            Playable temp =playList.get(i);
            
            ss = ss + temp.toString() + "\n";
        }
        return ss;
    }
}
