import java.util.Scanner;
/**
 * Selection with input
 **/ 
public class MyProgram
{
     public void runMyProgram()
    {
        //Write your code here
        Scanner reader = new Scanner(System.in);
        int mark ;
        mark = reader.nextInt();
        
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
