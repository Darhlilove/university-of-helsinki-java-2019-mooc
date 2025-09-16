
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics allNumbersStatistics = new Statistics();
        Statistics evenNumbersStatistics = new Statistics();
        Statistics oddNumbersStatistics = new Statistics();
        
        System.out.println("Enter numbers:");
        while (true) {   
            int userInput = scanner.nextInt();
            
            if(userInput == -1){
                break;
            }
            
            if (userInput % 2 == 0) {
                evenNumbersStatistics.addNumber(userInput);
            } else {
                oddNumbersStatistics.addNumber(userInput);
            }
            
            allNumbersStatistics.addNumber(userInput);
        }
        
        System.out.println("Sum: " + allNumbersStatistics.sum());
        System.out.println("Sum of even numbers: " + evenNumbersStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddNumbersStatistics.sum());
    }
}
