
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String userInput = scanner.nextLine();
            
            if (userInput.isBlank()) {
                break;
            }   
            
            items.add(new Item(userInput));
        }
        
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }
}
