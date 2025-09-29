package Ch51Book;

public class BookMain {
    public static void main(String[] args) {

        Book Java = new Book("Java","james Gosling","1");
        Book C = new Book("2");

        System.out.println(Book.totalNoOfBooks);

        Java.borrowBook();
        C.borrowBook();
        Java.borrowBook();
        Java.returnBook();
        Java.returnBook();
    }
}
