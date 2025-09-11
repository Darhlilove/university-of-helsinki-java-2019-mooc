
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        divisibleByThreeInRange(3,6);
    }

    //First solution
//    public static void divisibleByThreeInRange(int beginning, int end){
//        // Find starting multiple of 3
//        int startingMultiplicity = beginning/3;
//        int startingPointer = beginning % 3;
//        
//        // Check if there is a valid multiple of 3 in range
//        if(startingPointer > 0 && (startingMultiplicity + 1) * 3 > end){
//            System.out.println("There is no multiple of three in the range!");
//            return;
//        }
//        
//        int lastMultipleOfThree = 0;
//        
//        if (startingPointer == 0) {
//            lastMultipleOfThree = beginning;
//        } else if (startingPointer > 0){
//            lastMultipleOfThree = (startingMultiplicity + 1) * 3;
//        }
//        
//        while (lastMultipleOfThree <= end) {            
//            System.out.println(lastMultipleOfThree);
//            lastMultipleOfThree += 3;
//        }   
//    }
    
    // Revised solution
    public static void divisibleByThreeInRange(int beginning, int end){
        // Find starting multiple of 3
        int start = beginning;
        if (start % 3 != 0) {
            start = start + 3 - (start % 3);
        }
        
        // Check if there is a valid multiple of 3 in range
        if (start > end){
            System.out.println("There is no multiple of three in the range!");
        }
        
        // Print multiples
        for (int i = start; i <= end; i += 3) {
            System.out.println(i);
        }
    }
}
