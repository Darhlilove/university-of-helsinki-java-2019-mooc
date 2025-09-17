import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String programName = scanner.nextLine();
            
            if (programName.isBlank()) {
                break;
            }
            
            System.out.println("Duration:");
            int programDuration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(programName, programDuration));
        }
        
        
        System.out.println("Program's maximum duration?");
        int maxDuration = scanner.nextInt();
        
        for (int index = 0; index < programs.size(); index++) {
            TelevisionProgram program = programs.get(index);
            
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}
