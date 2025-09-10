
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user number
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        
        // Print user number
        System.out.println("You gave the number " + number);
    }
}
