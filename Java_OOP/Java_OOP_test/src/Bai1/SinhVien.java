package Bai1;

public class SinhVien {

    private String maSinhVien;
    private String hoVaTen;
    private double diemTB;
    LopHoc lop;

    public SinhVien(String maSinhVien, String hoVaTen, double diemTB, LopHoc lop) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.diemTB = diemTB;
        this.lop = lop;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    public void inThonTin(){
        lop.inThongTin();
        System.out.println("Mã sinh viên là: " + maSinhVien);
        System.out.println("Họ và tên là: " + hoVaTen);
        System.out.println("Điểm trung bình là: " + diemTB);
    }
}
