
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read user's number
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        
        // Print positive or not
        if (number > 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }   
    }
}
