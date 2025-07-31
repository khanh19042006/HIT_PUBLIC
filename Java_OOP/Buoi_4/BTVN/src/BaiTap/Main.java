package BaiTap;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void  main(String[] args) {
        System.out.print("Có muốn nhập thông tin hs không ? (Y/N) ");
        String check = sc.nextLine();


        if (check.equalsIgnoreCase("N")) {
            Student hs1 = new Student("Khánh", 2006, "Hà Nội", 10, 10, 10, 0);
            Student hs2 = new Student("Linh", 2005, "Hà Nội", 10, 5, 10, 3);
            Student hs3 = new Student("Nguyên", 2009, "Hà Nội", 10, 10, 1, 2);
            Student hs4 = new Student("Quân", 2012, "Hà Nội", 10, 2, 10, 1);
            Student hs5 = new Student("Dũng", 2003, "Hà Nội", 3, 10, 10, 6);
            Data.students[1] = hs1;
            Data.students[2] = hs2;
            Data.students[3] = hs3;
            Data.students[4] = hs4;
            Data.students[5] = hs5;
            Data.sl = 5;
        } else {
            Manege.input(1);
        }

        Manege.ThongKe();

        System.out.print("Bạn có muốn chỉnh sửa ? (Y/N) ");
        check = sc.nextLine();
        while (check.equalsIgnoreCase("Y")) {
            System.out.println("1 Thêm sinh viên mới");
            System.out.println("2 Sửa thông tin sinh viên");
            System.out.println("3 Sắp xếp sinh viên theo Tuổi");
            System.out.println("4 Sắp xếp sinh viên theo GPA");
            System.out.println("5 Sắp xếp sinh viên theo Số tiết nghỉ");
            System.out.println("6 Xóa sinh viên khỏi danh sách");
            System.out.print("Hãy chọn số tương ứng với thao tác mà bạn muốn: ");
            int query = Integer.parseInt(sc.nextLine());
            if (query == 1){
                Manege.Themhs();
                System.out.println("Thêm thành công !");
            }
            else if (query == 2) {
                Manege.ThongKe();
                System.out.print("Hãy chọn stt của sinh viên muốn sửa: ");
                int stt = Integer.parseInt(sc.nextLine());
                if (stt > Data.sl) System.out.println("Stt không hợp lệ");
                else {
                    System.out.println("Chọn thông tin muốn sửa: ");
                    System.out.println("1: Tên");
                    System.out.println("2: Năm sinh");
                    System.out.println("3: Địa chỉ");
                    System.out.println("4: Điểm TX1");
                    System.out.println("5: Điểm TX2");
                    System.out.println("6: Điểm KTHP");
                    System.out.println("7: Số tiết nghỉ");
                    int que = Integer.parseInt(sc.nextLine());
                    if (que == 1) {
                        System.out.print("Nhập tên mới: ");
                        String newName = sc.nextLine();
                        Data.students[stt].setName(newName);
                        System.out.println("Chỉnh sửa thành công");
                    } else if (que == 2) {
                        System.out.println("Nhập năm sinh mới: ");
                        int newbirthday = Integer.parseInt(sc.nextLine());
                        Data.students[stt].setBirthday(newbirthday);
                        System.out.println("Chỉnh sửa thành công");
                    } else if (que == 3) {
                        System.out.println("Nhập địa chỉ mới: ");
                        String newAddres = sc.nextLine();
                        Data.students[stt].setAddres(newAddres);
                        System.out.println("Chỉnh sửa thành công");
                    } else if (que == 4) {
                        System.out.println("Nhập điểm TX1 mới: ");
                        float newTX1 = Float.parseFloat(sc.nextLine());
                        Data.students[stt].setTx1(newTX1);
                        System.out.println("Chỉnh sửa thành công");
                    } else if (que == 5) {
                        System.out.println("Nhập điểm TX2 mới: ");
                        float newTX2 = Float.parseFloat(sc.nextLine());
                        Data.students[stt].setTx2(newTX2);
                        System.out.println("Chỉnh sửa thành công");
                    } else if (que == 6) {
                        System.out.println("Nhập điểm KTHP mới: ");
                        float newKTHP = Float.parseFloat(sc.nextLine());
                        Data.students[stt].setKthp(newKTHP);
                        System.out.println("Chỉnh sửa thành công");
                    } else if (que == 7) {
                        System.out.println("Nhập số tiết nghỉ mới: ");
                        int newSoTietNghi = Integer.parseInt(sc.nextLine());
                        Data.students[stt].setSo_tiet_nghi(newSoTietNghi);
                        System.out.println("Chỉnh sửa thành công");
                    } else System.out.println("Cú pháp không hợp lệ");
                }
            } else if (query == 3) {
                Manege.SortByBirthday();
                Manege.ThongKe();
            } else if (query == 4) {
                Manege.SortByGPA();
                Manege.ThongKe();
            } else if (query == 5) {
                Manege.SortBySoTietNghi();
                Manege.ThongKe();
            } else if (query == 6) {
                Manege.ThongKe();
                System.out.print("Chọn stt của sinh viên muốn xóa: ");
                int delStt = Integer.parseInt(sc.nextLine());
                Manege.DeleteHS(delStt);
                System.out.println("Đã xóa thành công !");
                Manege.ThongKe();
            } else System.out.println("Cú pháp không hợp lệ !");

            System.out.println();
            System.out.print("Bạn còn muốn tiếp tục chỉnh sửa không ? (Y/N) ");
            check = sc.nextLine();
        }
    }
}