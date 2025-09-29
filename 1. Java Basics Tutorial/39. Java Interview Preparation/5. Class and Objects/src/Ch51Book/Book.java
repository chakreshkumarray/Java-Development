package Ch51Book;
public class Book {

    static int totalNoOfBooks = 0; // static variable

    String title;                 // instance variable
    String author;
    String isbn;

    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }{
        totalNoOfBooks++;
    }

    Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }

    public static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if (isBorrowed){
            System.out.println("Book is Already Borrowed");
        }else {
            this.isBorrowed = true;
            System.out.println("Enjoy :"+this.title);
        }
    }

    void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("Enjoy the book.., Please leave review");
        }else {
            System.out.println("This book is already in the library");
        }
    }

}
