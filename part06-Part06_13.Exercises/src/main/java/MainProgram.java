
public class MainProgram {
    
    public static void main(String[] args) {
        ExerciseManagement management = new ExerciseManagement();
        
        management.add("Go home");
        management.add("Go to school");
        
        System.out.println(management.exerciseList());
        
        management.remove("Go to school");
        
        System.out.println(management.exerciseList());
    }

    // update here your exercise progress
    public static int partsCompleted() {
        return 6;
    }
}
