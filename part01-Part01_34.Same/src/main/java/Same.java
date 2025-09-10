
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read user's first input
        System.out.println("Enter the first string:");
        String firstString = scan.nextLine();
        
        // Read user's second input
        System.out.println("Enter the second string:");
        String secondString = scan.nextLine();
        
        // Compare strings
        if (firstString.equals(secondString)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
