
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = null;
        int longestNameLength = 0;
        int sumOfYears = 0;
        int countOfYears = 0;
        
        while (true) {            
            String userInput = scanner.nextLine();
            
            if(userInput.isBlank()){
                break;
            }
            
            String[] parts = userInput.split(",");
            int year = Integer.valueOf(parts[1]);
            int nameLength = parts[0].length();
            
            if (nameLength > longestNameLength) {
                longestNameLength = nameLength;
                longestName = parts[0];
            }
            
            countOfYears++;
            sumOfYears += year;  
        }
        
        double averageOfYears = (double) sumOfYears / countOfYears;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageOfYears);
    }
}
