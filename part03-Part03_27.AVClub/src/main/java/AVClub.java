
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            String userInput = scanner.nextLine();
            
            if (userInput.isBlank()) {
                break;
            }
            
            String[] words = userInput.split(" ");
            
            for (int index = 0; index < words.length; index++) {
                String word = words[index];
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
