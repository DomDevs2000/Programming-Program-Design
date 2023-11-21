 

   

import java.util.*;

/**This class implements the RAPP interface
 *
 * @author A.A.Marczyk 
 * @version 15/10/23
 **/
public class Park implements RAPP
{
    private String parkName;
    private ArrayList<Pass> allPasses= new ArrayList<Pass>();
    // complete this section by adding other required fields

    
    
    
    /** constructor
     * @param nme - name of park
     */
    public Park(String nme) 
    {
     
        
    }
    
    /**
     * Returns all of the details of the park: its name and its zones 
     * including lists of passes in each zone.
     */
    public String toString()
    {
         
        return "";
    }
    
    /**Returns a String with details of a pass
     * @param passId - id number of the pass
     * @return the details of the pass as a String, or "No such pass"
     */
    public String getPassDetails(int passId)
    {
        
        return "";
    } 
    
    /**Returns the name of the zone which contains the specified pass or null
     * @param ccd - the specified pass
     * @return the name of the Zone which contains the pass, or null
     **/
    public String getPassLocation(int cd)
    {
        
        return null;
    }
    
    /** Given the name of a zone, returns the zone id number
     * or -1 if zone does not exist
     * @param name of zone
     * @return id number of zone
     */
    public int getZoneNumber(String ww)
    {
        
        return 0;
    }
                
    /**Returns a String representation of all the passes on specified zone
     * @param zone is the name of the zone
     * @return a String representation of all passes on specified zone
     **/
    public String getAllPassesInOneZone(String zone)
    {
        
        return "";
    } 

    
    /**Returns true if a Pass is allowed to move using the bridge, false otherwise
     * A move can be made if:  
     * the rating of the pass  >= the rating of the destination zone
     * AND the destination zone is not full
     * AND the pass has sufficient credits
     * AND the pass is currently in the source zone
     * AND the pass id is for a pass on the system
     * AND the bridge code is the code for a bridge on the system
     * @param trId is the id of the pass requesting the move
     * @param znCode is the code of the bridge by which the pass wants to move
     * @return true if the pass is allowed on the bridge journey, false otherwise 
    **/
    public boolean canMove(int trId, String znCode)
    {   
        
        return false;
    }     

    /**Returns the result of a pass requesting to move over a bridge.
     * A move will be successful if:  
     * the luxury rating of the pass  >= the luxury rating of the destination zone
     * AND the destination zone is not full
     * AND the pass has sufficient credits
     * AND the pass is currently in the source zone
     * AND the pass id is for a pass in the system
     * AND the bridge code is the code for a bridge on the system
     * If the bridge crossing can be made, the pass information is removed from 
     * the source zone, added to the destination zone, pass details updated and a suitable message returned.
     * a suitable message returned.
     * If bridge journey cannot be made, the state of the system remains unchanged
     * and a message specifying the reason is returned.
     * @param pPassId is the id of the pass requesting the move
     * @param znCode is the code of the bridge by which the pass wants to move
     * @return a String giving the result of the request 
     **/
    public String move(int pPassId, String znCode )
    {   
        return "";
    }     

    /** Allows a pass to top up their credits.This method is not concerned with 
     *  the cost of a credit as currency and prices may vary between resorts.
     *  @param id the id of the pass toping up their credits
     *  @param creds the number of credits purchased to be added to passes information
     */
    public void topUpCredits(int id, int creds)
    {
        
    }

   /** Allows a pass to convert its points to credits
     *  @param cdId the id of the pass converting their credits
     */
    public void convertPoints(int cdId)
    {
    
    }
    //***************private methods**************
    private void loadZones()
    {
        
    }
    
    private void setUpBridges()
    {
        
    }
    
    private void loadPasses()
    {
        
    }
 
    /** Returns the pass with the pass id specified by the parameter
     * @return the pass with the specified id
     **/
    private Pass getPass(int id)
    {
        
        return null;
    }
    
    
    /** Returns the zone with the name specified by the parameter
     * @return the zone with the specified name
     **/
    private Zone getZone(String zoneName)
    {
        
        return null;
    }
    
    /** Returns the zone with the name specified by the parameter
     * @return the zone with the specified name
     **/
    private Bridge getBridge(String br)
    {
       return null; 
    }
    
    
    
}