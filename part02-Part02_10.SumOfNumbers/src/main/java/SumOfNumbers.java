
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        
        // Keep receiving number inputs from user
        while (true) {            
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            // Check exit condition
            if (number == 0){
                break;
            }
            
            // Add number to existing sum
            sumOfNumbers += number;
        }
        
        // Print sum
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
