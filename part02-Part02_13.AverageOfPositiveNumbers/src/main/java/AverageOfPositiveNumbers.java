
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // To track number of positive numbers and sum
        int positivesCount = 0;
        int sumOfPositives = 0;
        
        // Keep asking for number till exit (0)
        while (true) {            
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            // Check exit condition
            if (number == 0) {
                break;
            }
            
            // If positive, increase positives count by 1 and add to sum
            if (number > 0) {
                positivesCount += 1;
                sumOfPositives += number;
            }
        }
        
        // Calculate and present average if there is at least one number
        if (positivesCount <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            // Calculate and present average
            double average = (double) sumOfPositives/positivesCount;
            System.out.println(average);
        } 
    }
}
