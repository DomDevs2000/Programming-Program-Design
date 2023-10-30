import java.util.Scanner;

/**
 * More versatile: allows user to input 10 numbers 
 * and then search for a specific number
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyProgram
{
    Scanner reader = new Scanner(System.in);
    
    public void runMyProgram()
    {
        //Write your code here
        int[] myArray = inArray();   // function call
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Which number? ");
        int searchFor = reader.nextInt();
        
        int result = search (myArray, searchFor);  //function call
        if (result != -1)
        {
            System.out.println(searchFor + " is in position " + result);
        }
        else
        {
            System.out.println(searchFor + " is not in the database ");
        }
        System.out.println("Check the array");
        printArray(myArray);
        
    }
    
// Method definitions
    /* method to fill the DB with random numbers
    */       
    public int[] inArray()
    {
        int [] list = new int [10];
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 10 numbers between 0-50");
        for (int i = 0; i < list.length; i++)
        {
            list[i] = reader.nextInt();
        }
        return list;
    }
        
    /* method to search a int[] using a search key
    */
    public int search (int[] list, int skey)
    { 
        for (int i = 0; i < list.length; i++)
        { 
            if (skey == list[i])
            {
               return i;
            }
        }
        return -1;
    }

    // define printArray()
    
    public static void main(String[] args)
    { 
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
