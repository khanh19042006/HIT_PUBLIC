import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        String tuoi = sc.nextLine();

        System.out.print("Nhap lop: ");
        String lop = sc.nextLine();

        System.out.print("Nhap diem: ");
        String diem = sc.nextLine();

        System.out.print("Tên: " + ten + " - Tuổi: " + tuoi + " - Lớp: " + lop + " - GPA: " + diem);
    }
}