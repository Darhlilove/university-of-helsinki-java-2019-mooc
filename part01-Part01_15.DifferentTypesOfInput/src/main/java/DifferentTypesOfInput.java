
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read string from user
        System.out.println("Give a string:");
        String string = scan.nextLine();
        
        // Read integer from user
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());
        
        // Read double from user
        System.out.println("Give a double:");
        double floatingPoint = Double.valueOf(scan.nextLine());
        
        // Read boolean from user
        System.out.println("Give a boolean:");
        boolean trueOrFalse = Boolean.valueOf(scan.nextLine());
        
        // Print user's responses
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + floatingPoint);
        System.out.println("You gave the boolean " + trueOrFalse);

    }
}
