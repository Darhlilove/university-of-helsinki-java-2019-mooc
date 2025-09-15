
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] users = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
                
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        int counter = 0;
        boolean validLogin = false;
        
        while (counter < users.length) {            
            if (username.equals(users[counter]) && password.equals(passwords[counter])) {
                validLogin = true;
            }
            counter++;
        }
        
        if (validLogin) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
