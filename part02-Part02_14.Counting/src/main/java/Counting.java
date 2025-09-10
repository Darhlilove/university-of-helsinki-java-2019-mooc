
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read user's number
//        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        
        while (counter <= number) {            
            System.out.println(counter);
            counter += 1;
        }
    }
}
