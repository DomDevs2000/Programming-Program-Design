
/**
 * Write a description of class AEUsersArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AEUsersArray
{
    private Patient[] waiting = new Patient[20];
    private int pointer = 0;
    
    /** 
     * Adds a Patient object to the array
     * @param p is the reference to the Patient object
     */
    public void addPatient(Patient p)
    {
        if (pointer < waiting.length)
        {
            waiting[pointer] = p; 
        }
        pointer++;
    }
    
     /** 
     * Adds a Patient object to the array
     * @param pN is the patient's number
     * @param nme is the patient's name
     * @param gp is the patient's GP
     * @param d - day of patient's birth
     * @param m - month of patients' birth
     * @param y - year of patient's birth
     */
    public void addPatient(int pN, String nme, String gp, int d,int m, int y)
    {
        Patient xx = new Patient(pN,nme,gp,d,m,y);
        if (pointer < waiting.length)
        {
            waiting[pointer] = xx; 
        }
        pointer++;
    }
    
    
    /** 
     * Adds a Patient object to the array at the specified position
     * @param pos it the position 
     * @param pp is the reference to the Patient object
     */
    public void addPatient(int pos, Patient pp)
    {
        if (pos < waiting.length)
        {
            for ( int i = pointer; i>=pos; i--)
            {
                waiting[i + 1] = waiting[i];
            }
        }
        waiting[pos] = pp;
        pointer++;
    }
    
    
    public void removePatient(int index)
    {
        for(int i = index; i< pointer; i++)
        {
            waiting[i] = waiting[i+1];
        }
        pointer--;
    }
    
    /** Returns the position in the array of the patient with the 
     *  specified patient number
     *  @param PNo is the patient's number
     *  @return the position of the patient in the array, 
     *  or -1 if not found
     */
    public int findPatientbyPNo(int PNo)
    {
        for (int i = 0; i < pointer; i++)
        {
            if((waiting[i].getPatientNo() == PNo))
            {
                return i;
            }
        }
        return -1;
    }
    
            
    public Patient getPatient(int pos)
    {
        if (pos < pointer)
        {
            return waiting[pos];
        }
        return null;
    }
    
    public Patient getPatientbyPNo(int PNo)
    {
        for (int i = 0; i < pointer; i++)
        {
            if((waiting[i].getPatientNo() == PNo))
            {
                return waiting[i];
            }
        }
        return null;
    }
    
    public void print()
    {
        for (int i = 0; i < pointer; i++)
        {
            System.out.println(waiting[i].toString());
        }
    }
    
    public String toString()
    {
        String ss = "\n";
        for (int i = 0; i < pointer; i++)
        {
            ss = ss + waiting[i] + "\n";
        }
        return ss;
    }   
}
