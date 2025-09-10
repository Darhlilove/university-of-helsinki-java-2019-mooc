
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 1;

        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        
        while (counter <= number) {            
            sum += counter;
            counter += 1;
        }
        
        System.out.println("The sum is " + sum);
    }
}
