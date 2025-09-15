
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.isBlank()) {
                break;
            }
            
            String[] words = userInput.split(" ");
            
            for (int index = 0; index < words.length; index++) {
                System.out.println(words[index]);
            }
        }

    }
}
