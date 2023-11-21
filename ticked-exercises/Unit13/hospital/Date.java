/**
 * Simple Date Class - no error checking.
 * 
 * @author A.A.Marczyk (based on earlier version by M.Wood)
 * @version Version 1.0 - 15/11/04
 */
public class Date
{
    /** Fields of a Date - just the day, month and year*/
    private int day;
    private int month;
    private int year;
    
    /**
     * Constructor for objects of class Date
     * @param d - the day part of the date (1 - 31, depending on the month).
     * @param m - the month part of the date (1 - 12).
     * @param y - the year part of the date.
     */
    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }

    /**
     * @return the date as a String, format "09/11/2002"
     */
    public String getAsString ()
    {
        return as2Digits(day) + "/" + as2Digits(month) + "/" + year;
    }
    
    /** Internal method to add a leading zero if necessary. */
    private String as2Digits (int i)
    {
        if (i <10) 
        {
            return "0" + i;
        }
        else 
        {
            return "" + i;
        }
    }
}
