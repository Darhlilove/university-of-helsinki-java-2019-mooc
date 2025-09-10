
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Count number of values entered by user
        int numberOfValues = 0;
        
        while (true) {            
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            
            // Check exit condition
            if (value == 0){
                break;
            }
            
            numberOfValues += 1;
        }
        
        // Print result
        System.out.println("Number of numbers: " + numberOfValues);
    }
}
