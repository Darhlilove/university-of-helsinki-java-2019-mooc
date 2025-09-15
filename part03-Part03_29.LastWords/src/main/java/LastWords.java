
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {            
            String userInput = scanner.nextLine();
            
            if (userInput.isBlank()) {
                break;
            }
            
            String[] words = userInput.split(" ");
            System.out.println(words[words.length - 1]);
        }

    }
}
