
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first number
        System.out.println("Enter the first number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        // Read second number
        System.out.println("Enter the second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        // Find square root
        double squareRoot = Math.sqrt(firstNumber + secondNumber);
        
        // Print square root
        System.out.println(squareRoot);     
    }
}
