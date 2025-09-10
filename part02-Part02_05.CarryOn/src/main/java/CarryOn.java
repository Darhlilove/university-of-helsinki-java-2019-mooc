
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Shall we carry on?
        while (true){
            System.out.println("Shall we carry on?");
            String response = scanner.nextLine();
            
            if (response.equals("no")) {
                break;
            }
        }

    }
}
