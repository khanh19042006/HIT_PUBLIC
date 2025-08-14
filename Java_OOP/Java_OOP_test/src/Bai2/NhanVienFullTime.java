package Bai2;

public class NhanVienFullTime extends NhanVien {
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime(String maNV, String ten, int tuoi, String email, String phoneNumber, double luongCoBan, double tienThuong) {
        super(maNV, ten, tuoi, email, phoneNumber);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    @Override
    public double TinhLuong(){
        return luongCoBan + tienThuong;
    }

    @Override
    public void hienThiThongTin(){
        System.out.println("Mã nhân viên là: " + getMaNV());
        System.out.println("Tên nhân viên là: " + getTen());
        System.out.println("Tuổi nhân viên là: " + getTuoi());
        System.out.println("Email nhân viên là: " + getEmail());
        System.out.println("Số điện thoại nhân viên là: " + getPhoneNumber());
        System.out.println("Lương của nhân viên là: " + TinhLuong());
        System.out.println("Loại nhân viên là: FullTime");
        System.out.println();
    }
}
