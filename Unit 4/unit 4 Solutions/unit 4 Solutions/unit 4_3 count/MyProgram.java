import javax.swing.JOptionPane;

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
        //Can you change this so target depends on user input?
        int count = 0;
        int target = 100;
        int total = 0; 
        while (count < target)
        {
            count = count + 1;
        }
        System.out.println(count);
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
