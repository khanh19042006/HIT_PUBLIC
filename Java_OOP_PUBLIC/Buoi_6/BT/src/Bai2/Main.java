package Bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<NhanVien> DSNhanVien = new ArrayList<>();
        QuanLyNhanVien QLNhanVien = new QuanLyNhanVien(DSNhanVien);

        NhanVien nv1 = new NhanVienFullTime("0", "Khánh", 19, "dinhkhanh19042006@gmail.com", "0365631904", 200,100);
        NhanVien nv2 = new NhanVienFullTime("1" , "Linh", 20, "vnl@gmail.com", "001206020141", 50,200);
        NhanVien nv3 = new NhanVienPartTime("2", "Nguyên", 19, "vtn", "06195215", 5, 100);
        NhanVien nv4 = new NhanVienPartTime("3", "Quân", 20, "ntq@gmail.com", "0695125652", 6, 100);

        QLNhanVien.themNhanVien(nv1);
        QLNhanVien.themNhanVien(nv2);
        QLNhanVien.themNhanVien(nv3);
        QLNhanVien.themNhanVien(nv4);

        QLNhanVien.hienThiThongTinNhanVien();
        System.out.println(QLNhanVien.tongLuongNhanVien());
    }
}
