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
        int linecount = 0;
        int starcount = 0;
        int total = 0;
        String mstring = JOptionPane.showInputDialog("Enter size" );
        int target = Integer.parseInt(mstring);
        while (linecount <= target)
        {
            while (starcount < linecount)
            {
                System.out.print("*");
                starcount = starcount +1;
            }
            System.out.println("\n");
            starcount = 0;
            linecount = linecount+1;
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
