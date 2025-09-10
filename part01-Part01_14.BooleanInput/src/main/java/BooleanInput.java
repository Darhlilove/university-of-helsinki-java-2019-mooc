
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user response
        System.out.println("Write something:");
        boolean response = Boolean.valueOf(scanner.nextLine());
        
        // Print boolean value of user's response
        System.out.println("True or false? " + response);

    }
}
