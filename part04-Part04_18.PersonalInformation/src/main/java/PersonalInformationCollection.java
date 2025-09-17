
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("First name: ");
            String firstName = scanner.nextLine();
            
            if (firstName.isBlank()) {
                break;
            }
            
            System.out.println("Last name: ");
            String lastName = scanner.nextLine();
            
            System.out.println("Identification number: ");
            String identificationNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
            
        }
        
        for (int index = 0; index < infoCollection.size(); index++) {
            PersonalInformation person = infoCollection.get(index);
            
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

    }
}
