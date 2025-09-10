
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read user's number
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        
        // Print even or odd
        if (number % 2 == 0){
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}
