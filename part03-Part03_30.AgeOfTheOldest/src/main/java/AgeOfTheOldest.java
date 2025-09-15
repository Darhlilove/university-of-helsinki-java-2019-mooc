
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = -1;

        while (true) {            
            String userInput = scanner.nextLine();
            
            if (userInput.isBlank()) {
                break;
            }
            
            String[] parts = userInput.split(",");
            int age = Integer.valueOf(parts[1]);
            if (age > oldestAge) {
                oldestAge = age;
            }
        }
        
        System.out.println("Age of the oldest: " + oldestAge);
    }
}
