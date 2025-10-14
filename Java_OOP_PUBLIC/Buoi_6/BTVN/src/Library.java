import java.util.ArrayList;

public class Library {

    private ArrayList<Book> listBook;

    public Library(ArrayList<Book> listBook) {
        this.listBook = listBook;
    }

    public ArrayList<Book> getListBook() {
        return listBook;
    }

    public void setListBook(ArrayList<Book> listBook) {
        this.listBook = listBook;
    }

    public void addBook(Book book){
        this.listBook.add(book);
        Book.setBookId(listBook.size());
    }

    public void displayAllBooks (boolean showPublisher){
        for (int i = 0; i < this.listBook.size(); i++){
            System.out.println(i+1 + ".");
            this.listBook.get(i).displayInfor();
            this.listBook.get(i).displayInfor(showPublisher);
            System.out.println();
        }
    }

    public void searchByAuthor (String author){
        for (int i = 0; i < this.listBook.size(); i++){
            if (this.listBook.get(i).getAuthor().toLowerCase().contains(author.toLowerCase())){
                this.listBook.get(i).displayInfor();
                System.out.println();
            }
        }
    }

    public void removeBookById (int bookId){
        bookId -= 1;
        if (bookId < 0 || bookId >= this.listBook.size()){
            System.out.println("Mã sách không hợp lệ");
        }
        else{
            this.listBook.remove(bookId);
            System.out.println("Xóa thành công !");
        }
    }
}
