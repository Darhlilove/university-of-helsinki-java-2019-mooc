
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first number
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        // Read second number
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        // Read third number
        System.out.println("Give the third number:");
        int thirdNumber = Integer.valueOf(scanner.nextLine());
        
        // Sum of numbers
        int sum = firstNumber + secondNumber + thirdNumber;
        
        // Print sum of numbers
        System.out.println("The sum of the numbers is " + sum);
        

    }
}
