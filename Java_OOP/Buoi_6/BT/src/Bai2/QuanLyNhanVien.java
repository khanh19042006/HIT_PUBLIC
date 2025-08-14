package Bai2;

import java.util.ArrayList;

public class QuanLyNhanVien {

    ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    public QuanLyNhanVien(ArrayList<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }

    public ArrayList<NhanVien> getDsNhanVien() {
        return dsNhanVien;
    }

    public void setDsNhanVien(ArrayList<NhanVien> dsNhanVien) {
        this.dsNhanVien = dsNhanVien;
    }


    public void themNhanVien(NhanVien nv){
        this.dsNhanVien.add(nv);
    }

    public void hienThiThongTinNhanVien(){
        for (int i = 0; i < dsNhanVien.size(); i++){
            dsNhanVien.get(i).hienThiThongTin();
        }
    }

    public double tongLuongNhanVien(){
        double tongLuong = 0;
        for (int i = 0; i < dsNhanVien.size(); i++){
            tongLuong += dsNhanVien.get(i).TinhLuong();
        }
        return tongLuong;
    }
}
