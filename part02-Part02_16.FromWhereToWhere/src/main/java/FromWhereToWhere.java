
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read end number
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        int counter = 1;
        
        // Read start number
        System.out.println("Where from?");
        int start = Integer.valueOf(scanner.nextLine());
        
        // Print numbers if start is less than or equal end
        if (start <= end){
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }   
    }
}
