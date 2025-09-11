
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int numberOfTimes = Integer.valueOf(scanner.nextLine());

        if (numberOfTimes <= 0) {
            System.out.println("Invalid number. Provide a number greater than 0!");
            return;
        }
        
        int counter = 0;
        while (counter < numberOfTimes) {
            printText();
            counter++;
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
