
/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyProgram
{
    public void runMyProgram()
    {
        int weeks;
        int days;
        
        weeks = 10;
        days    =  weeks * 7;
        System.out.println(weeks + " weeks " + days + " days");
        
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
