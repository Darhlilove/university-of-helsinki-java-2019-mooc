
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read user's year
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
        
        // Print "Ancient history!" is older than 2015
        if(year < 2015){
            System.out.println("Ancient history!");
        }
    }
}
