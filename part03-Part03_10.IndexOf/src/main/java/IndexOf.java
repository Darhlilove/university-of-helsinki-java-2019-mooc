
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.println("Search for? ");
        int searchNumber = scanner.nextInt();
        int counter = 0;
        
        while (counter < list.size()) {
            int listNumber = list.get(counter);
            
            if (searchNumber == listNumber) {
                System.out.println(searchNumber + " is at index " + counter);
            }
            
            counter++;
        }
        
    }
}
