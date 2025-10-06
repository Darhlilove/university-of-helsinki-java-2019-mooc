
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object compared){
        // Check if stored in same location
        if (this == compared) {
            return true;
        }
        
        // Check compared is of type Person
        if(!(compared instanceof Person)){
            return false;
        }
        
        // Convert compared to Person type
        Person otherPerson = (Person) compared;
        
        // If all object variables are equal, they are equals
        if (this.name.equals(otherPerson.name) &&
                this.birthday.equals(otherPerson.birthday) &&
                this.height == otherPerson.height &&
                this.weight == otherPerson.weight) {
            return true;
        }
        
        // Else they are not
        return false;
    }
}
