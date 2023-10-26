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
        
        for (int i = 0; i < 3; i ++) {
            
        double firstRandomNumber = Math.random();
        System.out.println("First Random Number Is: " + firstRandomNumber);
        System.out.println("Is the Second Number Higher or Lower?");
        double secondRandomNumber = Math.random();
        String userNumber = reader.nextLine();
            if (userNumber.equals("true")){
            System.out.println("well guessed");
            score = score + 10;
        } else {
            System.out.println("sorry, wrong");
            score = score - 10;
        }
        }
        System.out.println("your score is: " + score);

    }

    public static void main(String[] args) {
        MyProgram prog = new MyProgram();
        prog.runMyProgram();
    }
}
