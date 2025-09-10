
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // To track number of numbers and sum
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;
        
        // Keep requesting for number till exit (0)
        while (true) {            
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            // Check exit condition
            if (number == 0) {
                break;
            }
            
            // Increase number of numbers by 1
            numberOfNumbers += 1;
            
            // Add number to previous sum
            sumOfNumbers += number;
        }
        
        // Calculate average
        if (numberOfNumbers > 0) {
            double average = (double) sumOfNumbers / numberOfNumbers;
            System.out.println("Average of the numbers: " + average);
        }

    }
}
