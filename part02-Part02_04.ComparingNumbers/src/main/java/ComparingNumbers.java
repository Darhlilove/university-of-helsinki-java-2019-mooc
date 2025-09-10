
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read user's first number
        System.out.println("Give first number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        // Read user's second number
        System.out.println("Give second number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        // Compare and present result
        if (firstNumber > secondNumber){
            System.out.println(firstNumber + " is greater than " + secondNumber + ".");
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is smaller than " + secondNumber + ".");
        } else {
            System.out.println(firstNumber + " is equal to " + secondNumber + ".");
        }
    }
}
