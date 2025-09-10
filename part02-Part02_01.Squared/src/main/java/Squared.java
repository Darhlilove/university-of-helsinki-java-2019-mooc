
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read user's number
        System.err.println("Enter number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        // Print square of number
        System.out.println(number * number);

    }
}
