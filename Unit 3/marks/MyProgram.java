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
        //Write your code here
        int mark = 67;
        
        if (mark>=50)
        {
            System.out.println("PASS");
        }
        else 
        {
            System.out.println("FAIL");
        }  
        
        System.out.println("Thank you");             
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
