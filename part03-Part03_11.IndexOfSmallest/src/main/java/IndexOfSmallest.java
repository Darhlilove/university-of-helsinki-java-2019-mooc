
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize list
        ArrayList<Integer> list = new ArrayList<>();
        
        // Receives user's numbers
        while (true) {            
            int number = scanner.nextInt();
            
            if(number == 9999){
                break;
            }
            
            list.add(number);
        }
        
        // Find smallest number
        int smallest = list.get(0);
        
        for (int i = 0; i < list.size(); i++) {
            int listNumber = list.get(i);
            
            if(smallest > listNumber){
                smallest = listNumber;
            }
        }
        
        // Print smallest number
        System.out.println("Smallest number: " + smallest);
        
        // Find and print indices of where smallest number is found
        for (int i = 0; i < list.size(); i++) {
            int listNumber = list.get(i);
            
            if (listNumber == smallest) {
                System.out.println("Found at index: " + i);
            }
        }  
    }
}
