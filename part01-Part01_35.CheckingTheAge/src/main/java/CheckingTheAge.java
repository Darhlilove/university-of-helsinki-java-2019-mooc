
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read user's age
        System.out.println("How old are you?");
        int age = Integer.valueOf(scan.nextLine());
        
        // OK or Impossible?
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
