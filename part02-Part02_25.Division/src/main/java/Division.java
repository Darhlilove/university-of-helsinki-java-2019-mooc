
public class Division {

    public static void main(String[] args) {
        division(3, 5);
    }

    public static void division(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero!");
            return;
        }

        double result = (double) numerator / denominator;
        System.out.println(result);
    }
}
