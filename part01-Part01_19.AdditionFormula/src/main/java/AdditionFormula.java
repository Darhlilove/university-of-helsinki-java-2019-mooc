
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first number
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        // Read second number
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        // Print formula and result to user
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

    }
}
