
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title:");
            String bookTitle = scanner.nextLine();

            if (bookTitle.isBlank()) {
                break;
            }

            System.out.println("Pages:");
            int numberOfPages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookTitle, numberOfPages, publicationYear));
        }

        System.out.println("What information will be printed?");
        String needInfo = scanner.nextLine();

        if (!needInfo.equals("everything") && !needInfo.equals("name")) {
            return;
        }

        for (int index = 0; index < books.size(); index++) {
            Book book = books.get(index);

            if (needInfo.equals("everything")) {
                System.out.println(book);
            } else {
                System.out.println(book.getTitle());
            }
        }

    }
}
