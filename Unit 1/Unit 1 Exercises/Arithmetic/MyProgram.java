
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
        
        int first = 5;
        int second = 7;
        
        int answer = first + second;
        
        int x = 16;
        int y = 5;
        int z = 3;
        
        answer = x + z * y;
        answer = x / y;
        answer = x % y;
        answer = x + z % y;
        answer = (x + z) % y;
        answer = x +(z%y);
       
        System.out.println(answer);
        
        
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
