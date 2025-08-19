import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        ArrayList<Book> listBook = new ArrayList<>();
        Library Lib = new Library(listBook);

        while (true) {
            System.out.println("Hãy chọn chức năng bạn muốn");
            System.out.println("1: Thêm sách vào thư viên");
            System.out.println("2: Hiện thị danh sách sách");
            System.out.println("3: Tìm sách theo tên tác giả");
            System.out.println("4: Xóa sách theo mã");
            System.out.println("5: Thoát chương trình");

            int choose = Integer.parseInt(sc.nextLine());
            String check;
            
            if (choose == 1){
                System.out.println("Nhập thông tin sách bạn muốn thêm");
                System.out.print("title: ");
                String title = sc.nextLine();
                System.out.print("author: ");
                String author = sc.nextLine();
                System.out.print("price: ");
                double price = Double.parseDouble(sc.nextLine());

                System.out.println("Có thông tin nhà xuất bản không ? (Y/N)");
                check = sc.nextLine();
                
                if (check.equalsIgnoreCase("Y")) {
                    System.out.print("Name Publisher: ");
                    String namePublisher = sc.nextLine();
                    System.out.print("Address Publisher: ");
                    String addressPublisher = sc.nextLine();
                    Lib.addBook(new Book(title, author, price, new Publisher(namePublisher, addressPublisher)));
                } 
                else if (check.equalsIgnoreCase("N")) {
                    Lib.addBook(new Book(price, author, title));
                }
                else {
                    System.out.println("Cú pháp không hợp lệ !");
                    System.out.println("Thêm sách không thành công");
                }
            } 
            else if (choose == 2) {
                System.out.println("Bạn có muốn hiển thị thông tin nhà xuất bản không ? (Y/N)");
                check = sc.nextLine();
                
                if (check.equalsIgnoreCase("Y")){
                    Lib.displayAllBooks(true);
                }
                else{
                    Lib.displayAllBooks(false);
                }
            }
            else if (choose == 3) {
                System.out.print("Nhập tên tác giả muốn tìm: ");
                String nameAuthor = sc.nextLine();
                Lib.searchByAuthor(nameAuthor);
            }
            else if (choose == 4) {
                System.out.print("Nhập mã sách bạn muốn xóa: ");
                int id = Integer.parseInt(sc.nextLine());
                Lib.removeBookById(id);
            } else if (choose == 5) {
                break;
            }
            else{
                System.out.println("Cú pháp không hợp lệ");
            }
            System.out.println();
        }
    }
}