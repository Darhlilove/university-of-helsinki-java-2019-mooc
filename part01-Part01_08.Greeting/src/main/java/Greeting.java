
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for name
        System.out.println("What's your name?");
        
        // Receive user response
        String response = scanner.nextLine();
        
        // Respond to user with greeting
        System.out.println("Hi " + response);

    }
}
