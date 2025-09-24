import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(input, ageRec));
        }
        System.out.println(bookList.size() + " book(s) in total \n");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(bookList, comparator);

        System.out.println("Books:");

        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
