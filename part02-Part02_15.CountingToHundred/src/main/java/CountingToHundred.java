
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user's number
        int number = Integer.valueOf(scanner.nextLine());
        int counter = number;
        int end = 100;
        
        while (counter <= end) {            
            System.out.println(counter);
            counter += 1;
        }       
    }
}
