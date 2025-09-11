
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // First solution
//        int stars = 1;
//        int space = size - stars;
//        
//        while (stars <= size) {            
//            printSpaces(space);
//            printStars(stars);
//            
//            stars++;
//            space--;
//        }   
        
        // Improved solution
        for (int row = 1; row <= size; row++) {
            int space = size - row;
            int stars = row;
            
            printSpaces(space);
            printStars(stars);
        }
    }

    public static void christmasTree(int height) {
        // First solution
//        for (int i = 1; i <= height; i++) {
//            int space = height - i;
//            int stars = i;
//            
//            printSpaces(space);
//            printStars(stars);
//        }
//        
//        int count = 0;
//        while (count < 2) {            
//            printSpaces(height - 2);
//            printStars(3);
//            count++;
//        }
        
        // Improved solution
        for (int row = 1; row <= height; row++) {
            int space = height - row;
            int stars = 2 * row - 1;
            
            printSpaces(space);
            printStars(stars);
        }
        
        for (int i = 1; i <= 2; i++) {            
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
//        christmasTree(4);
//        System.out.println("---");
//        christmasTree(10);
    }
}
