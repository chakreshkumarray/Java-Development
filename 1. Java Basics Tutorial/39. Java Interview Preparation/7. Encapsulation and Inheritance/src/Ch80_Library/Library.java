package Ch80_Library;

public class Library {

    private String itemId;
    private String title;
    private String author;

    public void checkout() {
        System.out.println("checkout");
    }

    public void returnItem() {
        System.out.println("Returning the item");
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
