
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user's response
        System.out.println("How many days would you like to convert to seconds?");
        int numberOfDays = Integer.valueOf(scanner.nextLine());
        
        // Convert days to seconds
        int daysInSeconds = 60 * 60 * 24 * numberOfDays;
        
        //Print days in seconds
        System.out.println(daysInSeconds);
    }
}
