
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    @Override
    public boolean equals(Object compared){
        // Check if both have the same reference
        if (this == compared) {
            return true;
        }
        
        // Check if compared if of type Book
        if (!(compared instanceof Book)) {
            return false;
        }
        
        // Convert compared to type Book
        Book otherBook = (Book) compared;
        
        // If all name and publication year are same, they are equal
        if (this.name.equals(otherBook.name) &&
                this.publicationYear == otherBook.publicationYear) {
            return true;
        }
        
        // Else they are not equal
        return false;
    }

}
