import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String userName = userInput.nextLine();
        System.out.println("Enter a Number:");
        int userNumber = userInput.nextInt();
        for (int i = 0; i < userNumber; i++) {
            System.out.println(userName);
        }
        userInput.close();

    }
}
