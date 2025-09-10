
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        int counter = first;
        
        while (counter <= last) {            
            sum += counter;
            counter += 1;
        }
        
        System.out.println("The sum is " + sum);
    }
}
