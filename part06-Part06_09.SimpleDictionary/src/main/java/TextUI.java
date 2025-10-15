
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author darhlilove
 */
public class TextUI {

    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                
                dictionary.add(word, translation);
                continue;
            }
            
            if (command.equals("search")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                
                String translation = dictionary.translate(word);
                
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                    continue;
                }
                
                System.out.println(translation);
                continue;
            }

            System.out.println("Unkown command");
        }

    }
}
