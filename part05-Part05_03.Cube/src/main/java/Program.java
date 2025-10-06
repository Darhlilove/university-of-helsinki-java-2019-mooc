
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cube edge length:");
        int length = Integer.valueOf(scanner.nextLine());
        
        Cube cube = new Cube(length);
        System.out.println(cube);
    }
}
