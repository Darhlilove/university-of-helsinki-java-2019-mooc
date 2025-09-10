
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // To keep track of number of inputs and sum of them 
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;

        // Keep requesting for numbers till exit (0)
        while (true) {            
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            // Check exit condition
            if (number == 0){
                break;
            }
            
            // Increase number of inputs by 1
            numberOfNumbers += 1;
            
            // Add number to previous sum
            sumOfNumbers += number;
        }
        
        // Print number of inputs and sum
        System.out.println("Number of numbers: " + numberOfNumbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
