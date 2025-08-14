package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();

        LopHoc myLop = new LopHoc("007", "Lớp của nguười thành công");
        SinhVien sv1 = new SinhVien("1" , "Nguyễn Đình Duy Khánh", 10, myLop);
        SinhVien sv2 = new SinhVien("2", "Vũ Nhật Linh", 9.5, myLop);
        SinhVien sv3 = new SinhVien("3", "Vũ Thị Thảo Nguyên", 9.8, myLop);

        dsSinhVien.add(sv1);
        dsSinhVien.add(sv2);
        dsSinhVien.add(sv3);

        double maxDiemTB = 0;
        String nameOfmax = "";
        for (int i = 0; i < dsSinhVien.size(); i++){
            System.out.println(dsSinhVien.get(i).getHoVaTen());
            if (dsSinhVien.get(i).getDiemTB() > maxDiemTB){
                maxDiemTB = dsSinhVien.get(i).getDiemTB();
                nameOfmax = dsSinhVien.get(i).getHoVaTen();
            }
        }

        System.out.println("Người có điểm trung bình cao nhất là: " + nameOfmax);
    }
}