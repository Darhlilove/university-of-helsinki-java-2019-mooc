
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word: ");
        String word = scanner.nextLine();
        
        // Without loop
        System.out.print(word);
        System.out.print(word);
        System.out.print(word);
        
        // With loop
        int counter = 0;
        while (counter < 3) {            
            System.out.print(word);
            counter++;
        }
    }
}
