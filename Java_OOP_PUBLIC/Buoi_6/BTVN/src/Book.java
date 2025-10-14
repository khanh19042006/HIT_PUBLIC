public class Book {

    private static int bookId = 0;

    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(double price, String author, String title) {
        this.price = price;
        this.author = author;
        this.title = title;
        this.publisher = new Publisher("Unknown", "Unknown");
    }

    public static int getBookId() {
        return bookId;
    }

    public static void setBookId(int bookId) {
        Book.bookId = bookId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void displayInfor(){
        System.out.println("bookId: " + this.bookId);
        System.out.println("title: " + this.title);
        System.out.println("author: " + this.author);
        System.out.println("price: " + this.price);
    }

    public void displayInfor(boolean showPublisher){
        if (showPublisher){
            System.out.println("Publisher' name: " + this.publisher.getName());
            System.out.println("Publisher' address: " + this.publisher.getAddress());
        }
        else{
            System.out.println("Publisher: Unknown");
        }
    }

}
