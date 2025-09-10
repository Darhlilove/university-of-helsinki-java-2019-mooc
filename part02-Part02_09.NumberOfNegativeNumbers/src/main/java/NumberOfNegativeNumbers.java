
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfNegatives = 0;

        // Number of negatives
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            // Check exit condition
            if (number == 0) {
                break;
            }
            
            // Track negative numbers
            if (number < 0){
                numberOfNegatives += 1;
            }
        }
        
        // Print result
        System.out.println("Number of negative numbers: " + numberOfNegatives);
    }
}
