
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read user's number
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        
        // Print Orwell if 1984
        if (number == 1984){
            System.out.println("Orwell");
        }
    }
}
