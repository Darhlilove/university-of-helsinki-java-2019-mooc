
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialise list
        ArrayList<Integer> list = new ArrayList<>();
        
        // Receive and add user's numbers to list till exit (-1)
        while (true) {            
            int number = scanner.nextInt();
            
            if (number == -1) {
                break;
            }
            
            list.add(number);
        }
        
        // Calculate average and print average
        if (list.size() > 0) {
            int sum = 0;
            
            for (Integer number : list) {
                sum += number;
            }
            
            double average = (double) sum / list.size();
            
            System.out.println("Average: " + average);
        }        
    }
}
