
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String expectedPassword = "Caput Draconis";

        // Read user's password
        System.out.println("Password?");
        String password = scan.nextLine();
        
        // Compare password
        if (password.equals(expectedPassword)){
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
