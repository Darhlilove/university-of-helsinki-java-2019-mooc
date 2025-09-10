
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user's number
        System.out.println("Enter number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        // Print result
        if (number < 0) {
            System.out.println(number * -1);
        } else {
            System.out.println(number);
        }
    }
}
