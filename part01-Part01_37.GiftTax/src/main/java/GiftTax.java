
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax = 0;
        
        // Lower limits in descending order
        double firstLimit = 1000000;
        double secondLimit = 200000;
        double thirdLimit = 55000;
        double fourthLimit = 25000;
        double fifthLimit = 5000;

        // Read value of user's gift
        System.out.println("Value of the gift?");
        double valueOfGift = Double.valueOf(scan.nextLine());
        
        // Calculate tax
        if (valueOfGift >= firstLimit){
            tax = 142100 + ((valueOfGift - firstLimit) * 0.17);;
        } else if (valueOfGift >= secondLimit){
            tax = 22100 + ((valueOfGift - secondLimit) * 0.15);
        } else if (valueOfGift >= thirdLimit){
            tax = 4700 + ((valueOfGift - thirdLimit) * 0.12);
        } else if (valueOfGift >= fourthLimit) {
            tax = 1700 + ((valueOfGift - fourthLimit) * 0.10);
        } else if (valueOfGift >= fifthLimit) {
            tax = 100 + ((valueOfGift - fifthLimit) * 0.08);
        }
        
        // Present result
        if (tax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }
        
    }
}
