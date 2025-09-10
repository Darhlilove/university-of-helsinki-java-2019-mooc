
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Only positives
        while (true) {            
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            // Check exit condition
            if(number == 0){
                break;
            } 
            
            // Check unfit condition
            if (number < 0) {
                System.out.println("Unsuitable number");
                continue;
            } 
            
            // Print square of number
            System.out.println(number * number);
            
        }
    }
}
