import java.util.Scanner;

/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyProgram {
    public void runMyProgram() {
        Scanner reader = new Scanner(System.in);

       int score = 0;
        
       
        while (true){
            double firstRandomNumber = Math.random();
        System.out.println("First Random Number Is: " + firstRandomNumber);
        System.out.println("Is the Second Number Higher or Lower?");
        double secondRandomNumber = Math.random();
        String userNumber = reader.nextLine();
         
            if (secondRandomNumber >= firstRandomNumber && userNumber.equals("higher")){
            System.out.println("well guessed");
            score = score + 10;
            
        } else {
            System.out.println("sorry, wrong");
            score = score - 10;
        }
        System.out.println("Do you want to continue?");
        String nextGame = reader.nextLine();
        if(!nextGame.equals("y")){
               break;
            }
            
    }
        System.out.println("your score is: " + score);

    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
