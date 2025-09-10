
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numbersCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("Give numbers:");
        while (true) {            
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            numbersCount++;
            sum += number;
            
            if (number % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        if (numbersCount == 0){
            System.out.println("Enter at least one number");
            return;
        }
        
        double average = (double) sum/numbersCount;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbersCount);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
