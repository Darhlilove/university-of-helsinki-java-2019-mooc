
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read user's first number
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scan.nextLine());
        
        // Read user's second number
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scan.nextLine());
        
        // Print larger or same
        if (firstNumber > secondNumber){
            System.out.println("Greater number is: " + firstNumber);
        } else if (secondNumber > firstNumber){
            System.out.println("Greater number is: " + secondNumber);
        } else if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal!");
        }
        
    }
}
