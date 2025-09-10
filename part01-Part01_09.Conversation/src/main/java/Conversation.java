
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Greeting
        System.out.println("Greetings! How are you doing?");
        String firstResponse = scanner.nextLine();
        
        // More conversation
        System.out.println("Oh, how interesting. Tell me more!");
        String secondResponse = scanner.nextLine();
        
        // Final remarks
        System.out.println("Thanks for sharing!");
    }
}
