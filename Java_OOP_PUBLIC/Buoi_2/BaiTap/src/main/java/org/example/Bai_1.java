import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String name = sc.nextLine();

        System.out.print("Nhap tuoi: ");
        String tuoi = sc.nextLine();

        System.out.print("Nhap chieu cao: ");
        String chieu_cao = sc.nextLine();

        System.out.print("Xin chào " + name + ", bạn " + tuoi + " tuổi và " + chieu_cao + " cao mét.");
    }
}