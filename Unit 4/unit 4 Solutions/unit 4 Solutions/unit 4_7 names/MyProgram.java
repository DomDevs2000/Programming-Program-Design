import java.util.Scanner;

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
        Scanner reader = new Scanner(System.in);
        //Can you change this so target depends on user input?
        int count = 0;
        int target ; 
        System.out.println("Name ?");
        String name = reader.nextLine();
        System.out.println("How many times" );
        target = reader.nextInt();
 
        while (count < target)
        {
            System.out.println(count + "  " + name);
            count = count+1;
        }
    }
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
