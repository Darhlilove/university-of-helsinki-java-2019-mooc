
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = -1;
        String name = null;

        while (true) {            
            String userInput = scanner.nextLine();
            
            if (userInput.isBlank()) {
                break;
            }
            
            String[] parts = userInput.split(",");
            int age = Integer.valueOf(parts[1]);
            
            if (age > oldestAge) {
                name = parts[0];
                oldestAge = age;
            }
        }
        
        System.out.println("Name of the oldest: " + name);
    }
}
