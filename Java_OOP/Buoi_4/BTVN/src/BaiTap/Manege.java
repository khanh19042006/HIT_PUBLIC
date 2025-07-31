package BaiTap;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Manege {
    static Scanner sc = new Scanner(System.in);
    private static int year = 2025;
    private static int id = 1;

    public static void input(int type){
        if (type == 1){
            System.out.print("Nhập số lượng học sinh cần nhập: ");
            Data.sl = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Cú pháp nhập thông tin: Tên, Năm sinh, Địa chỉ (Viết liền), Điểm TX1, Điểm TX2, Điểm KTHP, Số tiết nghỉ");

        for (int i = id; i <= Data.sl; i++){
            System.out.print("Nhập thông tin hs số " + i + " : ");
            String[] information = sc.nextLine().split(" ");
            String name = information[0];
            int birthday = Integer.parseInt(information[1]);
            String addres = information[2];
            float tx1 = Float.parseFloat(information[3]);
            float tx2 = Float.parseFloat(information[4]);
            float kthp = Float.parseFloat(information[5]);
            int so_tiet_nghi = Integer.parseInt(information[6]);

            Student hs = new Student(name, birthday, addres, tx1, tx2, kthp, so_tiet_nghi);
            Data.students[i] = hs;
        }
    }

    public int getYear() {
        return year;
    }

    public static void setYear(int newYear) {
        year = newYear;
    }

    public static void ThongKe(){
        for (int i = 1; i <= Data.sl; i++) {
            System.out.println(i + ". " + Data.students[i].getName() + " " + (year - Data.students[i].getBirthday()) +
                    " Tuổi, Địa chỉ: " + Data.students[i].getAddres() + ", TX1: " + Data.students[i].getTx1() +
                    ", TX2: " + Data.students[i].getTx2() + ", Điểm KTHP: " + Data.students[i].getKthp() +
                    ", GPA: " + (Data.students[i].getTx1() * 0.2 + Data.students[i].getTx2() * 0.3 + Data.students[i].getKthp() * 0.5) +
                    ", Số tiết nghỉ: " + Data.students[i].getSo_tiet_nghi());
        }
    }

    public static void Themhs(){
        System.out.print("Nhập số lượng học sinh muốn thêm: ");
        int them = Integer.parseInt(sc.nextLine());
        id = Data.sl + 1;
        Data.sl += them;
        input(0);
        id = 1;
    }

    public static void SortByBirthday(){
        Arrays.sort(Data.students, 1, Data.sl+1, (s1, s2) ->{
                int birthday1 = year - s1.getBirthday();
                int birthday2 = year - s2.getBirthday();
                return Integer.compare(birthday1, birthday2);
        });
    }

    public static void SortByGPA(){
        Arrays.sort(Data.students, 1, Data.sl+1, (s1,s2) ->{
                double gpa1 = s1.getTx1() * 0.2 + s1.getTx2() * 0.3 + s1.getKthp() * 0.5;
                double gpa2 = s2.getTx1() * 0.2 + s2.getTx2() * 0.3 + s2.getKthp() * 0.5;
                return Double.compare(gpa1, gpa2);
        });
    }

    public static void SortBySoTietNghi(){
        Arrays.sort(Data.students, 1, Data.sl+1, (s1, s2) -> {
            return Integer.compare(s1.getSo_tiet_nghi(), s2.getSo_tiet_nghi());
        });
    }

    public static void DeleteHS(int stt){
        for (int i = stt+1; i <= Data.sl; i++){
            Data.students[i-1] = Data.students[i];
            Data.sl--;
        }
    }
}
