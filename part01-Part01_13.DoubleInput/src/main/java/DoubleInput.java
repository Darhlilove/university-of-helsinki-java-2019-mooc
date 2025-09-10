
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user number
        System.out.println("Give a number:");
        double number = Double.valueOf(scanner.nextLine());
        
        // Print user number
        System.out.println("You gave the number " + number);
    }
}
