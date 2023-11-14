
/**
 * Used to store information about a patient Including patient no., name, GP name
 * date of birth, time arrived and the time treatment was started
 * 
 * @author A.A.Marczyk 
 * @version 22/11/04
 */
public class Patient
{
    private int patientNo;
    private String name;
    private String gpName;
    private Date dob;
    
    /** Creates a patient
     * @param pNo represents the patient's number
     * @param n represents the name
     * @param gp represents the GP's (family doctor's) name
     * @param dd,mm,yy represent the components of the date of birth
     */
    public Patient(int pNo, String n, String gp, int dd,int mm, int yy)
    {
        patientNo = pNo;
        name = n;
        gpName = gp;
        dob = new Date(dd,mm,yy);
    }
    
    /** Returns the patient's number
     * @return patient number
     */
    public int getPatientNo()
    {
        return patientNo;
    }
    
    /** Returns the patient's name
     * @return name
     */
    public String getName()
    {
        return name;
    }
    
    /** Returns the patient's GP's name
     * @return GP name
     */
    public String getGPName()
    {
        return gpName;
    }
    
    /** Returns the patient's date of birth
     * @return date of birth
     */
    public Date getDOB()
    {
        return dob;
    }
    
    
    /** Returns a String representation of the patient information
     *  @return the patient information as a String
     */
    public String toString()
    {
        String s;
        s = "Patient No: " + patientNo + "  " + name + "\nGP name : " + gpName +"\nDate of birth: " + dob.getAsString();
        return s;
    }
}
