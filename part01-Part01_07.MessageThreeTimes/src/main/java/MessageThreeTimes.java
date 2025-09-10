
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        
        // Receive user input
        String response = scanner.nextLine();
        
        // Print user response thrice
        System.out.println(response);
        System.out.println(response);
        System.out.println(response);

    }
}
